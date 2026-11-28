package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Count subgroups in a fixed binary parabolic by projection and kernel intersection.
 * @author Gregory Morse
 */
public final class BinaryParabolicSubgroups {

  private static final class BinaryGroup {
    private final int mN;
    private final int mMask;
    private final int mIdentity;
    private final int[] mElements;
    private final int[] mGenerators;
    private final int[] mInverse;
    private final byte[][] mAction;
    private final int mOrder;

    private BinaryGroup(final int n, final boolean trivial) {
      mN = n;
      final int dimension = 1 << n;
      mMask = dimension - 1;
      final int bound = 1 << (n * n);
      int identity = 0;
      int rotate = 0;
      for (int i = 0; i < n; ++i) {
        identity |= 1 << ((n + 1) * i);
        rotate |= 1 << (n * i + (i + 1) % n);
      }
      mIdentity = identity;
      mOrder = trivial ? 1 : LinearGroupOrder.general(n, Z.TWO).intValueExact();
      if (n == 5 && !trivial) {
        mElements = new int[0];
        mGenerators = new int[] {rotate, identity ^ 2};
        mInverse = null;
        mAction = null;
        return;
      }
      mInverse = new int[bound];
      mAction = new byte[bound][];
      if (trivial) {
        mGenerators = new int[0];
        mElements = new int[] {identity};
        mAction[identity] = new byte[dimension];
        for (int i = 1; i < dimension; ++i) {
          mAction[identity][i] = (byte) i;
        }
        mInverse[identity] = identity;
        return;
      }
      mGenerators = n > 1 ? new int[] {rotate, identity ^ 2} : new int[0];
      mElements = new int[mOrder];
      int size = 0;
      for (int x = 1; x < bound; ++x) {
        final byte[] action = new byte[dimension];
        boolean invertible = true;
        int inverse = 0;
        for (int v = 1; v < dimension; ++v) {
          final int column = Integer.numberOfTrailingZeros(v);
          final int y = action[v & (v - 1)] ^ ((x >>> (n * column)) & mMask);
          if (y == 0) {
            invertible = false;
            break;
          }
          action[v] = (byte) y;
          if ((y & (y - 1)) == 0) {
            inverse |= v << (n * Integer.numberOfTrailingZeros(y));
          }
        }
        if (invertible) {
          mElements[size++] = x;
          mAction[x] = action;
          mInverse[x] = inverse;
        }
      }
      if (size != mElements.length) {
        throw new IllegalStateException("Wrong binary linear group order");
      }
    }

    private int multiply(final int x, final int y) {
      if (mAction == null) {
        return (int) BinaryLinearActions.multiply(x, y, mN);
      }
      int result = 0;
      final byte[] action = mAction[x];
      for (int i = 0; i < mN; ++i) {
        result |= action[(y >>> (mN * i)) & mMask] << (mN * i);
      }
      return result;
    }

    private int inverse(final int x) {
      return mInverse == null ? (int) BinaryLinearActions.inverse(x, mN) : mInverse[x];
    }

    private int apply(final int matrix, final int vector) {
      return mAction == null ? BinaryLinearActions.apply(matrix, vector, mN) : mAction[matrix][vector];
    }
  }

  private final BinaryGroup mA;
  private final BinaryGroup mB;
  private final int mShift;
  private final int mMask;
  final int mIdentity;
  private final int[] mAmbient;
  private final int mOrder;
  private final int[] mGenerators;
  private final int[] mSlot;
  private final IntBinaryOperator mExplicitProduct;
  private final IntUnaryOperator mExplicitInverse;
  final List<Entry> mRepresentatives = new ArrayList<>();
  private final Map<Key, Projection> mClasses = new HashMap<>();
  private int[][] mConjugations;
  private boolean mContainsWholeGroup;
  private Function<int[], Projection> mLocator;

  BinaryParabolicSubgroups(final int a, final int b, final boolean fixFirst) {
    mExplicitProduct = null;
    mExplicitInverse = null;
    mA = new BinaryGroup(a, fixFirst);
    mB = new BinaryGroup(b, b == 0);
    mShift = b * b;
    mMask = (1 << mShift) - 1;
    mIdentity = pair(mA.mIdentity, mB.mIdentity);
    mOrder = Math.multiplyExact(mA.mOrder, mB.mOrder);
    mAmbient = new int[mA.mElements.length * mB.mElements.length];
    mSlot = new int[mAmbient.length == 0 ? 0 : 1 << (a * a + b * b)];
    int end = 0;
    for (final int x : mA.mElements) {
      for (final int y : mB.mElements) {
        final int v = pair(x, y);
        mSlot[v] = end;
        mAmbient[end++] = v;
      }
    }
    mGenerators = new int[mA.mGenerators.length + mB.mGenerators.length];
    end = 0;
    for (final int g : mA.mGenerators) {
      mGenerators[end++] = pair(g, mB.mIdentity);
    }
    for (final int g : mB.mGenerators) {
      mGenerators[end++] = pair(mA.mIdentity, g);
    }
  }

  private BinaryParabolicSubgroups(final int identity, final int[] elements, final int[] generators,
                                   final IntBinaryOperator product, final IntUnaryOperator inverse) {
    mA = null;
    mB = null;
    mShift = 0;
    mMask = 0;
    mIdentity = identity;
    mOrder = elements.length;
    mAmbient = elements;
    mGenerators = generators;
    mExplicitProduct = product;
    mExplicitInverse = inverse;
    mSlot = new int[1 + Arrays.stream(elements).max().orElseThrow()];
    Arrays.fill(mSlot, -1);
    for (int i = 0; i < elements.length; ++i) {
      if (mSlot[elements[i]] != -1) {
        throw new IllegalStateException("Duplicate explicit group element");
      }
      mSlot[elements[i]] = i;
    }
  }

  static BinaryParabolicSubgroups explicit(final int identity, final int[] elements, final int[] generators,
                                           final IntBinaryOperator product, final IntUnaryOperator inverse) {
    final BinaryParabolicSubgroups group = new BinaryParabolicSubgroups(identity, elements, generators, product, inverse);
    group.enumerate();
    return group;
  }

  static BinaryParabolicSubgroups explicitContainer(final int identity, final int[] elements, final int[] generators,
                                                    final IntBinaryOperator product, final IntUnaryOperator inverse) {
    return new BinaryParabolicSubgroups(identity, elements, generators, product, inverse);
  }

  int pair(final int a, final int b) {
    return (a << mShift) | b;
  }

  int multiply(final int x, final int y) {
    if (mExplicitProduct != null) {
      return mExplicitProduct.applyAsInt(x, y);
    }
    return pair(mA.multiply(x >>> mShift, y >>> mShift), mB.multiply(x & mMask, y & mMask));
  }

  int inverse(final int x) {
    if (mExplicitInverse != null) {
      return mExplicitInverse.applyAsInt(x);
    }
    return pair(mA.inverse(x >>> mShift), mB.inverse(x & mMask));
  }

  int conjugate(final int x, final int a) {
    return multiply(multiply(a, x), inverse(a));
  }

  int point(final int projection, final int vector) {
    final int a = mA.mN;
    return mA.apply(projection >>> mShift, vector & ((1 << a) - 1))
      | (mB.apply(projection & mMask, vector >>> a) << a);
  }

  int[] action(final int x) {
    final int a = mA.mN;
    final int b = mB.mN;
    final int matrix = x >>> mShift;
    final int inverse = mB.inverse(x & mMask);
    final int[] columns = new int[a * b];
    // A diagonal pair (A,B) acts on the off-diagonal block as X -> A X B^-1.
    for (int j = 0; j < columns.length; ++j) {
      final int vector = mA.apply(matrix, 1 << (j % a));
      for (int i = 0; i < b; ++i) {
        if ((inverse & (1 << (b * i + j / a))) != 0) {
          columns[j] |= vector << (a * i);
        }
      }
    }
    return columns;
  }

  private static final class Key {
    private final int[] mElements;
    private final int mHash;

    private Key(final int[] elements) {
      mElements = elements;
      Arrays.sort(mElements);
      mHash = Arrays.hashCode(elements);
    }

    @Override
    public int hashCode() {
      return mHash;
    }

    @Override
    public boolean equals(final Object that) {
      return that instanceof Key && Arrays.equals(mElements, ((Key) that).mElements);
    }
  }

  private final class Generated {
    private final BitSet mMembers = new BitSet();
    private final List<Integer> mElements = new ArrayList<>();
    private final List<Integer> mGenerators = new ArrayList<>();

    private Generated() {
      mMembers.set(mIdentity);
      mElements.add(mIdentity);
    }

    private Generated(final Entry subgroup) {
      for (final int x : subgroup.mElements) {
        mMembers.set(x);
        mElements.add(x);
      }
      for (final int x : subgroup.mGenerators) {
        mGenerators.add(x);
      }
    }

    private void add(final int x) {
      if (!mMembers.get(x)) {
        mGenerators.add(x);
        final int size = mElements.size();
        final List<Integer> reps = new ArrayList<>();
        reps.add(mIdentity);
        for (int k = 0; k < reps.size(); ++k) {
          for (final int g : mGenerators) {
            final int r = multiply(reps.get(k), g);
            if (!mMembers.get(r)) {
              reps.add(r);
              for (int j = 0; j < size; ++j) {
                final int y = multiply(mElements.get(j), r);
                mElements.add(y);
                mMembers.set(y);
              }
              if (mElements.size() == mOrder) {
                return;
              }
            }
          }
        }
      }
    }
  }

  static final class Entry {
    final int mIndex;
    final int[] mElements;
    final int[] mGenerators;
    final int[] mNormalizer;
    final int mClassSize;
    final int mOrder;

    private Entry(final int index, final int[] elements, final int[] generators, final int[] normalizer, final int classSize, final int order) {
      mIndex = index;
      mElements = elements;
      mGenerators = generators;
      mNormalizer = normalizer;
      mClassSize = classSize;
      mOrder = order;
    }
  }

  static final class Projection {
    final Entry mEntry;
    final int mTransport;

    Projection(final Entry entry, final int transport) {
      mEntry = entry;
      mTransport = transport;
    }
  }

  Projection locate(final int[] elements) {
    return mLocator == null ? mClasses.get(new Key(elements)) : mLocator.apply(elements);
  }

  void setLocator(final Function<int[], Projection> locator) {
    mLocator = locator;
  }

  int order() {
    return mOrder;
  }

  long upperBlock(final int projection) {
    return projection >>> mShift;
  }

  void offerProduct(final int[] generators, final int[] normalizer, final int order, final int normalizerOrder) {
    if (mOrder % normalizerOrder != 0) {
      throw new IllegalArgumentException("Projection normalizer order is not integral");
    }
    mRepresentatives.add(new Entry(mRepresentatives.size(), null, generators, normalizer, mOrder / normalizerOrder, order));
  }

  static BinaryParabolicSubgroups affineFive(final BinaryGlSubgroups five) {
    final BinaryParabolicSubgroups group = new BinaryParabolicSubgroups(1, 5, false);
    for (final BinaryGlSubgroups.Subgroup subgroup : five.classes()) {
      group.offerProduct(Arrays.stream(subgroup.mGenerators).mapToInt(x -> group.pair(1, (int) x)).toArray(),
        Arrays.stream(subgroup.mNormalizer).mapToInt(x -> group.pair(1, (int) x)).toArray(),
        Math.toIntExact(subgroup.mOrder), Math.toIntExact(subgroup.mNormalizerOrder));
    }
    return group;
  }

  static BinaryParabolicSubgroups small(final int dimension) {
    return project(dimension, 0);
  }

  static BinaryParabolicSubgroups project(final int a, final int b) {
    final BinaryParabolicSubgroups group = new BinaryParabolicSubgroups(a, b, false);
    group.enumerate();
    return group;
  }

  static Z fixesSpace(final int a, final int b) {
    return new BinaryParabolicSubgroups(a, b, true).count();
  }

  private void offer(final Generated h) {
    if (h.mElements.size() == mAmbient.length) {
      if (mContainsWholeGroup) {
        return;
      }
      mContainsWholeGroup = true;
    }
    final Key root = new Key(h.mMembers.stream().toArray());
    if (mClasses.containsKey(root)) {
      return;
    }
    final List<Key> queue = new ArrayList<>();
    final List<Integer> transports = new ArrayList<>();
    final Map<Key, Integer> local = new HashMap<>();
    final Generated normalizer = new Generated();
    local.put(root, mIdentity);
    queue.add(root);
    transports.add(mIdentity);
    for (int k = 0; k < queue.size(); ++k) {
      final Key old = queue.get(k);
      for (int j = 0; j < mGenerators.length; ++j) {
        final int g = mGenerators[j];
        final int[] elements = new int[old.mElements.length];
        if (mConjugations == null) {
          for (int i = 0; i < elements.length; ++i) {
            elements[i] = conjugate(old.mElements[i], g);
          }
        } else {
          final int[] permutation = mConjugations[j];
          for (int i = 0; i < elements.length; ++i) {
            elements[i] = permutation[mSlot[old.mElements[i]]];
          }
        }
        final Key next = new Key(elements);
        final int t = multiply(g, transports.get(k));
        final Integer s = local.putIfAbsent(next, t);
        if (s == null) {
          queue.add(next);
          transports.add(t);
        } else {
          normalizer.add(multiply(inverse(s), t));
        }
      }
    }
    if (normalizer.mElements.size() * queue.size() != mAmbient.length) {
      throw new IllegalStateException("Wrong normalizer size");
    }
    final Entry entry = new Entry(mRepresentatives.size(), root.mElements, h.mGenerators.stream().mapToInt(Integer::intValue).toArray(),
      normalizer.mGenerators.stream().mapToInt(Integer::intValue).toArray(), queue.size(), root.mElements.length);
    mRepresentatives.add(entry);
    for (int i = 0; i < queue.size(); ++i) {
      mClasses.put(queue.get(i), new Projection(entry, transports.get(i)));
    }
  }

  private void extend(final Entry h) {
    // Hx and HxH give the same generated overgroup. Conjugation by
    // N_G(H) preserves H and fuses additional extensions.
    final int[] coset = new int[mAmbient.length];
    final int[] x = new int[mAmbient.length / h.mElements.length];
    int end = 1;
    x[0] = mIdentity;
    for (final int e : h.mElements) {
      coset[mSlot[e]] = 1;
    }
    for (final int g : mAmbient) {
      if (coset[mSlot[g]] == 0) {
        x[end] = g;
        ++end;
        for (final int e : h.mElements) {
          coset[mSlot[multiply(e, g)]] = end;
        }
      }
    }
    if (end != x.length) {
      throw new IllegalStateException("Wrong coset count");
    }
    final BitSet seen = new BitSet(x.length);
    seen.set(0);
    final int[] queue = new int[x.length];
    for (int k = seen.nextClearBit(1); k < x.length; k = seen.nextClearBit(k + 1)) {
      queue[0] = k;
      seen.set(k);
      int size = 1;
      for (int i = 0; i < size; ++i) {
        final int current = x[queue[i]];
        for (final int g : h.mGenerators) {
          final int y = coset[mSlot[multiply(current, g)]] - 1;
          if (!seen.get(y)) {
            seen.set(y);
            queue[size++] = y;
          }
        }
        for (final int g : h.mNormalizer) {
          final int y = coset[mSlot[conjugate(current, g)]] - 1;
          if (!seen.get(y)) {
            seen.set(y);
            queue[size++] = y;
          }
        }
      }
      final Generated extended = new Generated(h);
      extended.add(x[k]);
      offer(extended);
    }
  }

  /**
   * Count subgroups of the standard parabolic of block sizes a and b.
   * @param a first block dimension
   * @param b second block dimension
   * @return subgroup count
   */
  public static Z count(final int a, final int b) {
    if (a < 1 || b < 1 || a > 4 || b > 4 || a + b > 6) {
      throw new IllegalArgumentException("Parabolic projection exceeds the small binary group census");
    }
    return new BinaryParabolicSubgroups(a, b, false).count();
  }

  private void enumerate() {
    if (mExplicitProduct != null && mAmbient.length >= (1 << 17)) {
      mConjugations = new int[mGenerators.length][mAmbient.length];
      for (int j = 0; j < mGenerators.length; ++j) {
        for (int i = 0; i < mAmbient.length; ++i) {
          mConjugations[j][i] = conjugate(mAmbient[i], mGenerators[j]);
        }
      }
    }
    offer(new Generated());
    for (int i = 0; i < mRepresentatives.size(); ++i) {
      extend(mRepresentatives.get(i));
    }
    mConjugations = null;
  }

  private Z count() {
    enumerate();
    long projections = 0;
    Z count = Z.ZERO;
    for (final Entry entry : mRepresentatives) {
      projections += entry.mClassSize;
      count = count.add(BinarySplitSubgroups.count(mA.mN * mB.mN, mIdentity, entry.mGenerators,
        this::multiply, this::action).multiply(entry.mClassSize));
    }
    if (projections != mClasses.size()) {
      throw new IllegalStateException("Class weights did not sum to the projection census");
    }
    return count;
  }

  /**
   * Count subgroups of GL(n,2) fixing some nonzero vector.
   * @param n matrix dimension, at most five
   * @return count of subgroups, without counting a group twice
   */
  public static Z withFixedVector(final int n) {
    if (n < 1 || n > 5) {
      throw new IllegalArgumentException("Fixed-vector census supports dimensions 1..5");
    }
    Z total = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      // Möbius inversion on the lattice of subspaces of the common
      // fixed space. A fixed k-space contributes (-1)^(k-1) 2^binomial(k,2).
      final Z fixed = k == n ? Z.ONE : new BinaryParabolicSubgroups(k, n - k, true).count();
      final Z weighted = fixed.multiply(Binomial.gaussianBinomial(n, k, 2)).shiftLeft((long) k * (k - 1) / 2);
      total = (k & 1) == 1 ? total.add(weighted) : total.subtract(weighted);
    }
    return total;
  }
}
