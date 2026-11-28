package irvine.math.group;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntUnaryOperator;

/**
 * Subgroup classes in a small split binary parabolic, with exact transporters.
 * @author Gregory Morse
 */
final class BinaryParabolicClasses {

  static final class Subgroup {
    final long[] mGenerators;
    final long[] mNormalizer;
    final int mOrder;
    final int mNormalizerOrder;

    private Subgroup(final long[] generators, final long[] normalizer, final int order, final int normalizerOrder) {
      mGenerators = generators;
      mNormalizer = normalizer;
      mOrder = order;
      mNormalizerOrder = normalizerOrder;
    }
  }

  static final class Located {
    final int mIndex;
    final long mTransport;
    final int mOrder;

    private Located(final int index, final long transport, final int order) {
      mIndex = index;
      mTransport = transport;
      mOrder = order;
    }
  }

  private static final class State {
    private final int[] mSpace;
    private final BigInteger mTuple;
    private final long mTransport;

    private State(final int[] space, final BigInteger tuple, final long transport) {
      mSpace = space;
      mTuple = tuple;
      mTransport = transport;
    }
  }

  private static final class Hit {
    private final int mIndex;
    private final long mTransport;

    private Hit(final int index, final long transport) {
      mIndex = index;
      mTransport = transport;
    }
  }

  private static final class Law {
    private final long mChange;
    private final int[] mAction;
    private final int[] mCoboundary;
    private final BigInteger[][] mWords;

    private Law(final long change, final int[] action, final int[] coboundary, final BigInteger[][] words) {
      mChange = change;
      mAction = action;
      mCoboundary = coboundary;
      mWords = words;
    }
  }

  private final int mA;
  private final int mB;
  private final int mN;
  private final int mD;
  private final int mBits;
  private final int mMask;
  private final int mVectorMask;
  private final BinaryParabolicSubgroups mGroup;
  private final BinaryGlSubgroups mFive;
  private final List<int[]> mSpaces = new ArrayList<>();
  private final Map<Integer, int[]> mActions = new HashMap<>();
  private final List<Map<BigInteger, Hit>> mIndex = new ArrayList<>();
  private final List<Subgroup> mClasses = new ArrayList<>();

  BinaryParabolicClasses(final int a, final int b) {
    this(a, b, false);
  }

  BinaryParabolicClasses(final int a, final int b, final boolean irreducibleFirst) {
    this(a, b, irreducibleFirst, null);
  }

  BinaryParabolicClasses(final BinaryGlSubgroups five) {
    this(1, 5, false, five);
  }

  private BinaryParabolicClasses(final int a, final int b, final boolean irreducibleFirst, final BinaryGlSubgroups five) {
    if (a < 1 || b < 1 || a + b > 5 && five == null && (!irreducibleFirst || a + b != 6 || b < 2 || b > 4)) {
      throw new IllegalArgumentException("Small parabolic classes support dimensions up to five");
    }
    mA = a;
    mB = b;
    mN = a + b;
    mD = a * b;
    mBits = a * a + b * b;
    mMask = (1 << mBits) - 1;
    mVectorMask = (1 << mD) - 1;
    mFive = five;
    if (five != null) {
      mGroup = BinaryParabolicSubgroups.affineFive(five);
    } else if (a == 4 && b == 2) {
      mGroup = BinarySmallQuotientProjections.irreducibleFour();
    } else if (a == 2 && b == 4) {
      mGroup = BinarySmallQuotientProjections.irreducibleTwo();
    } else {
      mGroup = BinaryParabolicSubgroups.project(a, b);
    }
    if (mN <= 5) {
      for (int r = 0; r <= mD; ++r) {
        mSpaces.addAll(BinaryLinearActions.spaces(mD, r));
      }
    }
    final List<int[]> firstProper = new ArrayList<>();
    for (int r = 1; r < a; ++r) {
      firstProper.addAll(BinaryLinearActions.spaces(a, r));
    }
    for (final BinaryParabolicSubgroups.Entry entry : mGroup.mRepresentatives) {
      if (irreducibleFirst) {
        final long[] first = Arrays.stream(entry.mGenerators).mapToLong(mGroup::upperBlock).toArray();
        if (firstProper.stream().anyMatch(s -> BinaryLinearActions.invariant(first, s))) {
          mIndex.add(Map.of());
          continue;
        }
      }
      classifyLifts(entry);
    }
  }

  List<Subgroup> classes() {
    return mClasses;
  }

  int order() {
    return mGroup.order() << mD;
  }

  private int[] action(final int g) {
    return mActions.computeIfAbsent(g, mGroup::action);
  }

  private long semidirect(final int g, final int v) {
    return g | ((long) v << mBits);
  }

  private long product(final long x, final long y) {
    final int g = (int) x & mMask;
    final int h = (int) y & mMask;
    return semidirect(mGroup.multiply(g, h), (int) (x >>> mBits) ^ BinarySplitSubgroups.apply(action(g), (int) (y >>> mBits)));
  }

  private long inverse(final long x) {
    final int g = mGroup.inverse((int) x & mMask);
    return semidirect(g, BinarySplitSubgroups.apply(action(g), (int) (x >>> mBits)));
  }

  private long embed(final long x) {
    final int g = (int) x & mMask;
    final int v = (int) (x >>> mBits);
    final int bb = (1 << (mB * mB)) - 1;
    final int blockA = g >>> (mB * mB);
    final int blockB = g & bb;
    long matrix = 0;
    for (int j = 0; j < mA; ++j) {
      matrix |= (long) BinaryLinearActions.column(blockA, j, mA) << (mN * j);
    }
    for (int j = 0; j < mB; ++j) {
      final int c = BinaryLinearActions.column(blockB, j, mB);
      matrix |= (long) (BinaryLinearActions.apply(v, c, mA) | (c << mA)) << ((mA + j) * mN);
    }
    return matrix;
  }

  private long extract(final long matrix) {
    int blockA = 0;
    int blockB = 0;
    int top = 0;
    for (int j = 0; j < mA; ++j) {
      final int c = BinaryLinearActions.column(matrix, j, mN);
      if ((c >>> mA) != 0) {
        throw new IllegalArgumentException("Element does not preserve the standard subspace");
      }
      blockA |= c << (j * mA);
    }
    for (int j = 0; j < mB; ++j) {
      final int c = BinaryLinearActions.column(matrix, mA + j, mN);
      blockB |= (c >>> mA) << (j * mB);
      top |= (c & ((1 << mA) - 1)) << (j * mA);
    }
    final long invB = BinaryLinearActions.inverse(blockB, mB);
    int kernel = 0;
    for (int j = 0; j < mB; ++j) {
      kernel |= BinaryLinearActions.apply(top, BinaryLinearActions.column(invB, j, mB), mA) << (j * mA);
    }
    return semidirect((blockA << (mB * mB)) | blockB, kernel);
  }

  private int[] map(final int[] basis, final int[] action) {
    final int[] result = new int[mD];
    for (final int b : basis) {
      BinarySplitSubgroups.insert(result, BinarySplitSubgroups.apply(action, b));
    }
    return result;
  }

  private static BigInteger key(final State s, final int width) {
    return BinarySplitSubgroups.key(s.mSpace).shiftLeft(width).or(s.mTuple);
  }

  private static int evaluate(final BigInteger[] word, final BigInteger tuple) {
    int result = 0;
    for (int j = 0; j < word.length; ++j) {
      result |= (word[j].and(tuple).bitCount() & 1) << j;
    }
    return result;
  }

  private List<Law> laws(final BinaryParabolicSubgroups.Entry p, final BinaryLiftChain presentation) {
    final int r = p.mGenerators.length;
    final List<Law> result = new ArrayList<>();
    final int[] id = action(mGroup.mIdentity);
    for (int k = 0; k < mD; ++k) {
      final int[] coboundary = new int[r];
      final BigInteger[][] words = new BigInteger[r][mD];
      for (int i = 0; i < r; ++i) {
        coboundary[i] = (1 << k) ^ action(p.mGenerators[i])[k];
        words[i] = presentation.word(p.mGenerators[i]);
      }
      result.add(new Law(semidirect(mGroup.mIdentity, 1 << k), id, coboundary, words));
    }
    for (final int h : p.mNormalizer) {
      final int inverse = mGroup.inverse(h);
      final BigInteger[][] words = new BigInteger[r][mD];
      for (int i = 0; i < r; ++i) {
        words[i] = presentation.word(mGroup.conjugate(p.mGenerators[i], inverse));
        if (words[i] == null) {
          throw new IllegalStateException("Projection normalizer does not normalize");
        }
      }
      result.add(new Law(semidirect(h, 0), action(h), new int[r], words));
    }
    return result;
  }

  private State act(final State s, final Law law) {
    final int[] space = map(s.mSpace, law.mAction);
    BigInteger tuple = BigInteger.ZERO;
    for (int i = 0; i < law.mWords.length; ++i) {
      final int value = BinarySplitSubgroups.apply(law.mAction, evaluate(law.mWords[i], s.mTuple)) ^ law.mCoboundary[i];
      tuple = tuple.or(BigInteger.valueOf(BinarySplitSubgroups.reduce(space, value)).shiftLeft(mD * i));
    }
    return new State(space, tuple, product(law.mChange, s.mTransport));
  }

  private void orbit(final BinaryParabolicSubgroups.Entry p, final Map<BigInteger, Hit> index, final List<Law> laws,
                     final int[] space, final BigInteger tuple, final int width) {
    final long identity = semidirect(mGroup.mIdentity, 0);
    final State root = new State(space, tuple, identity);
    final BigInteger rootKey = key(root, width);
    final int id = mClasses.size();
    if (index.putIfAbsent(rootKey, new Hit(id, identity)) != null) {
      return;
    }
    final List<State> queue = new ArrayList<>();
    final Set<Long> normalizer = new LinkedHashSet<>();
    queue.add(root);
    for (int i = 0; i < queue.size(); ++i) {
      final State s = queue.get(i);
      for (final Law law : laws) {
        final State t = act(s, law);
        final Hit old = index.putIfAbsent(key(t, width), new Hit(id, t.mTransport));
        if (old == null) {
          queue.add(t);
        } else if (old.mIndex != id) {
          throw new IllegalStateException("Intersecting lift orbits");
        } else {
          final long schreier = product(inverse(old.mTransport), t.mTransport);
          if (schreier != identity) {
            normalizer.add(schreier);
          }
        }
      }
    }
    final int mass = Math.multiplyExact(p.mClassSize, queue.size());
    if (order() % mass != 0) {
      throw new IllegalStateException("Lift orbit size does not divide parabolic order");
    }
    final int rank = rank(space);
    final long[] generators = new long[rank + p.mGenerators.length];
    int length = 0;
    for (final int x : space) {
      if (x != 0) {
        generators[length++] = embed(semidirect(mGroup.mIdentity, x));
      }
    }
    for (int i = 0; i < p.mGenerators.length; ++i) {
      generators[length++] = embed(semidirect(p.mGenerators[i], tuple.shiftRight(i * mD).intValue() & mVectorMask));
    }
    mClasses.add(new Subgroup(generators, normalizer.stream().mapToLong(this::embed).toArray(),
      p.mOrder << rank, order() / mass));
  }

  private static int rank(final int[] space) {
    int rank = 0;
    for (final int x : space) {
      if (x != 0) {
        ++rank;
      }
    }
    return rank;
  }

  private boolean invariant(final int[] space, final int[] projection) {
    for (final int g : projection) {
      final int[] action = action(g);
      for (final int x : space) {
        if (x != 0 && BinarySplitSubgroups.reduce(space, BinarySplitSubgroups.apply(action, x)) != 0) {
          return false;
        }
      }
    }
    return true;
  }

  private void classifyLifts(final BinaryParabolicSubgroups.Entry p) {
    final int r = p.mGenerators.length;
    final int width = mD * r;
    final BigInteger[][] initial = new BigInteger[r][mD];
    for (int i = 0; i < r; ++i) {
      for (int j = 0; j < mD; ++j) {
        initial[i][j] = BigInteger.ONE.shiftLeft(i * mD + j);
      }
    }
    final BinaryLiftChain pres = new BinaryLiftChain(mN, mD, width, mGroup.mIdentity, p.mGenerators, initial,
      mGroup::multiply, mGroup::inverse, mGroup::point, this::action);
    if (pres.order() != p.mOrder) {
      throw new IllegalStateException("Wrong presentation order");
    }
    final List<Law> laws = laws(p, pres);
    final Map<BigInteger, Hit> index = new HashMap<>();
    mIndex.add(index);
    long states = 0;
    final List<int[]> spaces = mN <= 5 ? mSpaces
      : BinarySplitSubgroups.invariantSpaces(mD, Arrays.stream(p.mGenerators).mapToObj(this::action).toArray(int[][]::new));
    for (final int[] space : spaces) {
      if (mN <= 5 && !invariant(space, p.mGenerators)) {
        continue;
      }
      final BigInteger[] equations = new BigInteger[width];
      BinarySplitSubgroups.quotientEquations(pres.relations(), space, equations);
      for (int i = 0; i < r; ++i) {
        for (int j = 0; j < mD; ++j) {
          if (space[j] != 0) {
            BinarySplitSubgroups.insert(equations, BigInteger.ONE.shiftLeft(i * mD + j));
          }
        }
      }
      final List<Integer> free = new ArrayList<>();
      for (int i = 0; i < width; ++i) {
        if (equations[i] == null) {
          free.add(i);
        }
      }
      if (free.size() > 22) {
        throw new UnsupportedOperationException("Small parabolic lift exceeds the solution budget");
      }
      states += 1L << free.size();
      for (int x = 0; x < (1 << free.size()); ++x) {
        BigInteger tuple = BigInteger.ZERO;
        for (int j = 0; j < free.size(); ++j) {
          if (((x >>> j) & 1) != 0) {
            tuple = tuple.setBit(free.get(j));
          }
        }
        for (int j = 0; j < width; ++j) {
          if (equations[j] != null && (equations[j].and(tuple).bitCount() & 1) != 0) {
            tuple = tuple.setBit(j);
          }
        }
        orbit(p, index, laws, space, tuple, width);
      }
    }
    if (states != index.size()) {
      throw new IllegalStateException("Lift orbits do not partition the quotient cocycles");
    }
  }

  Located locate(final long[] generators) {
    final long[] lifts = new long[generators.length];
    final int[] kernel = new int[mD];
    for (int i = 0; i < lifts.length; ++i) {
      lifts[i] = extract(generators[i]);
    }
    if (mFive != null) {
      return locateAffine(lifts, kernel);
    }
    final List<Integer> projections = new ArrayList<>();
    final Map<Integer, Integer> values = new HashMap<>();
    projections.add(mGroup.mIdentity);
    values.put(mGroup.mIdentity, 0);
    for (int i = 0; i < projections.size(); ++i) {
      final int q = projections.get(i);
      final long lift = semidirect(q, values.get(q));
      for (final long s : lifts) {
        final long product = product(lift, s);
        final int h = (int) product & mMask;
        final int value = (int) (product >>> mBits);
        final Integer previous = values.putIfAbsent(h, value);
        if (previous == null) {
          projections.add(h);
        } else {
          BinarySplitSubgroups.insert(kernel, previous ^ value);
        }
      }
    }
    final BinaryParabolicSubgroups.Projection q = mGroup.locate(projections.stream().mapToInt(Integer::intValue).toArray());
    return locate(lifts, kernel, q, values::get, projections.size());
  }

  private Located locateAffine(final long[] lifts, final int[] kernel) {
    final int[] generators = new int[lifts.length];
    final BigInteger[][] initial = new BigInteger[lifts.length][mD];
    for (int i = 0; i < lifts.length; ++i) {
      generators[i] = (int) lifts[i] & mMask;
      final int vector = (int) (lifts[i] >>> mBits);
      for (int j = 0; j < mD; ++j) {
        initial[i][j] = (vector & (1 << j)) == 0 ? BigInteger.ZERO : BigInteger.ONE;
      }
    }
    final BinaryLiftChain chain = new BinaryLiftChain(mN, mD, 1, mGroup.mIdentity, generators, initial,
      mGroup::multiply, mGroup::inverse, mGroup::point, this::action);
    for (final BigInteger[] relation : chain.relations()) {
      BinarySplitSubgroups.insert(kernel, evaluate(relation, BigInteger.ONE));
    }
    final BinaryGlSubgroups.Located root = mFive.locate(Arrays.stream(generators).mapToLong(x -> x & ((1 << 25) - 1)).toArray(),
      chain.order());
    final BinaryParabolicSubgroups.Projection q = new BinaryParabolicSubgroups.Projection(mGroup.mRepresentatives.get(root.mIndex),
      mGroup.pair(1, (int) root.mTransport));
    return locate(lifts, kernel, q, g -> evaluate(chain.word(g), BigInteger.ONE), Math.toIntExact(chain.order()));
  }

  private Located locate(final long[] lifts, final int[] kernel, final BinaryParabolicSubgroups.Projection q,
                         final IntUnaryOperator word, final int order) {
    // Relations generate the kernel as a module under the projected group.
    int before;
    do {
      before = rank(kernel);
      for (final long lift : lifts) {
        final int[] action = action((int) lift & mMask);
        for (int i = 0; i < mD; ++i) {
          BinarySplitSubgroups.insert(kernel, BinarySplitSubgroups.apply(action, kernel[i]));
        }
      }
    } while (rank(kernel) != before);
    if (q == null) {
      throw new IllegalStateException("Unknown projection subgroup");
    }
    final int t = q.mTransport;
    final int[] back = action(mGroup.inverse(t));
    final int[] space = map(kernel, back);
    BigInteger tuple = BigInteger.ZERO;
    for (int i = 0; i < q.mEntry.mGenerators.length; ++i) {
      final int g = mGroup.conjugate(q.mEntry.mGenerators[i], t);
      final int f = BinarySplitSubgroups.reduce(space, BinarySplitSubgroups.apply(back, word.applyAsInt(g)));
      tuple = tuple.or(BigInteger.valueOf(f).shiftLeft(i * mD));
    }
    final Hit hit = mIndex.get(q.mEntry.mIndex).get(key(new State(space, tuple, 0), mD * q.mEntry.mGenerators.length));
    if (hit == null) {
      throw new IllegalStateException("Unknown parabolic subgroup class");
    }
    return new Located(hit.mIndex, embed(product(semidirect(t, 0), hit.mTransport)), order << rank(kernel));
  }
}
