package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Ambient fusion for binary general linear subgroup classes.
 * @author Gregory Morse
 */
final class BinaryGlSubgroups {

  static final class Subgroup {
    final long[] mGenerators;
    final long[] mNormalizer;
    final long mOrder;
    final long mNormalizerOrder;

    private Subgroup(final long[] generators, final long[] normalizer, final long order, final long normalizerOrder) {
      mGenerators = generators;
      mNormalizer = normalizer;
      mOrder = order;
      mNormalizerOrder = normalizerOrder;
    }
  }

  private static final class Point {
    private final int mLocal;
    private final long mTransport;

    private Point(final int local, final long transport) {
      mLocal = local;
      mTransport = transport;
    }
  }

  static final class Located {
    final int mIndex;
    final long mTransport;

    private Located(final int index, final long transport) {
      mIndex = index;
      mTransport = transport;
    }
  }

  private final int mN;
  private final long mOrder;
  private final BinaryParabolicClasses[] mParabolics;
  private final List<List<int[]>> mSpaces = new ArrayList<>();
  private final List<Subgroup> mClasses = new ArrayList<>();
  private final int[][] mGlobal;
  private final long[][] mRoutes;

  BinaryGlSubgroups() {
    this(5, 0);
  }

  static BinaryGlSubgroups middleSix() {
    return new BinaryGlSubgroups(6, 3);
  }

  static BinaryGlSubgroups minimumTwo() {
    return new BinaryGlSubgroups(6, 2);
  }

  static BinaryGlSubgroups minimumOne(final BinaryGlSubgroups five) {
    return new BinaryGlSubgroups(6, 1, five);
  }

  static final class Slice {
    final int mClasses;
    final long mSubgroups;

    private Slice(final int classes, final long subgroups) {
      mClasses = classes;
      mSubgroups = subgroups;
    }
  }

  static Slice minimumFour() {
    final int n = 6;
    final int dimension = 4;
    final long order = LinearGroupOrder.general(n, Z.TWO).longValueExact();
    final BinaryParabolicClasses parabolic = new BinaryParabolicClasses(dimension, n - dimension, true);
    final List<int[]> smaller = new ArrayList<>();
    for (int k = 1; k < dimension; ++k) {
      smaller.addAll(BinaryLinearActions.spaces(n, k));
    }
    final List<int[]> spaces = BinaryLinearActions.spaces(n, dimension);
    int classes = 0;
    long total = 0;
    for (final BinaryParabolicClasses.Subgroup h : parabolic.classes()) {
      if (smaller.stream().noneMatch(s -> BinaryLinearActions.invariant(h.mGenerators, s))) {
        // Two distinct invariant 4-spaces would have a smaller nonzero
        // invariant intersection, so this space is unique.
        if (spaces.stream().filter(s -> BinaryLinearActions.invariant(h.mGenerators, s)).count() != 1
          || new BinaryStrongChain(n, h.mNormalizer).order() != h.mNormalizerOrder
          || order % h.mNormalizerOrder != 0) {
          throw new IllegalStateException("Wrong unique-space normalizer");
        }
        ++classes;
        total = Math.addExact(total, order / h.mNormalizerOrder);
      }
    }
    return new Slice(classes, total);
  }

  static long minimumTwoMass() {
    final BinaryParabolicClasses parabolic = new BinaryParabolicClasses(2, 4, true);
    final List<int[]> lines = BinaryLinearActions.spaces(6, 1);
    final List<int[]> planes = BinaryLinearActions.spaces(6, 2);
    Q weight = Q.ZERO;
    for (final BinaryParabolicClasses.Subgroup h : parabolic.classes()) {
      if (lines.stream().noneMatch(s -> BinaryLinearActions.invariant(h.mGenerators, s))) {
        final long invariantPlanes = planes.stream().filter(s -> BinaryLinearActions.invariant(h.mGenerators, s)).count();
        if (invariantPlanes == 0 || parabolic.order() % h.mNormalizerOrder != 0) {
          throw new IllegalStateException("Missing standard invariant plane");
        }
        weight = weight.add(new Q(parabolic.order() / h.mNormalizerOrder, invariantPlanes));
      }
    }
    final Q count = weight.multiply(Binomial.gaussianBinomial(6, 2, 2));
    if (!count.isInteger()) {
      throw new IllegalStateException("Nonintegral minimum-two incidence count");
    }
    return count.toZ().longValueExact();
  }

  private BinaryGlSubgroups(final int n, final int slice) {
    this(n, slice, null);
  }

  private BinaryGlSubgroups(final int n, final int slice, final BinaryGlSubgroups five) {
    mN = n;
    mOrder = LinearGroupOrder.general(mN, Z.TWO).longValueExact();
    mParabolics = new BinaryParabolicClasses[(mN + 2) / 2];
    for (int a = slice == 0 ? 1 : slice; a <= (slice == 0 ? mN / 2 : slice); ++a) {
      mParabolics[a] = five == null ? new BinaryParabolicClasses(a, mN - a, slice != 0) : new BinaryParabolicClasses(five);
      long mass = 0;
      int i = 0;
      for (final BinaryParabolicClasses.Subgroup h : mParabolics[a].classes()) {
        final BinaryParabolicClasses.Located found = mParabolics[a].locate(h.mGenerators);
        if (found.mIndex != i || found.mOrder != h.mOrder) {
          throw new IllegalStateException("Parabolic class does not locate itself");
        }
        final BinaryStrongChain normalizer = new BinaryStrongChain(mN, h.mNormalizer);
        if (normalizer.order() != h.mNormalizerOrder) {
          throw new IllegalStateException("Wrong parabolic normalizer stabilizer");
        }
        mass += mParabolics[a].order() / h.mNormalizerOrder;
        ++i;
      }
      if (slice == 0 && !BinaryParabolicSubgroups.count(a, mN - a).equals(Z.valueOf(mass))) {
        throw new IllegalStateException("Lift class masses disagree with the fixed-parabolic count");
      }
    }
    mGlobal = new int[mN][];
    mRoutes = new long[mN][];
    for (int d = 0; d < mN; ++d) {
      mSpaces.add(BinaryLinearActions.spaces(mN, d));
    }
    if (slice != 0) {
      fuse(slice);
      if (incidence(slice) != total()) {
        throw new IllegalStateException("Ambient subgroup classes disagree with the incidence count");
      }
    } else {
      for (int d = 1; d < mN; ++d) {
        fuse(d);
      }
      addSingerClasses();
    }
  }

  private long incidence(final int a) {
    final BinaryParabolicClasses parabolic = mParabolics[a];
    Q total = Q.ZERO;
    for (final BinaryParabolicClasses.Subgroup subgroup : parabolic.classes()) {
      final List<int[]> invariant = minimalSpaces(subgroup.mGenerators);
      if (!invariant.isEmpty() && dimension(invariant.get(0)) == a) {
        total = total.add(new Q(parabolic.order() / subgroup.mNormalizerOrder, invariant.size()));
      }
    }
    final Q count = total.multiply(Binomial.gaussianBinomial(mN, a, 2));
    if (!count.isInteger()) {
      throw new IllegalStateException("Nonintegral incidence count");
    }
    return count.toZ().longValueExact();
  }

  private long[] orient(final long[] matrices, final int a) {
    if (a <= mN / 2) {
      return matrices;
    }
    return Arrays.stream(matrices).map(x -> BinaryLinearActions.dual(x, mN, mN - a)).toArray();
  }

  private List<int[]> minimalSpaces(final long[] generators) {
    final List<int[]> result = new ArrayList<>();
    for (int d = 1; d < mN; ++d) {
      for (final int[] space : mSpaces.get(d)) {
        if (BinaryLinearActions.invariant(generators, space)) {
          result.add(space);
        }
      }
      if (!result.isEmpty()) {
        break;
      }
    }
    return result;
  }

  private Point point(final long[] generators, final int[] space, final int a, final int b) {
    final long change = BinaryLinearActions.completeBasis(space);
    final long inverse = BinaryLinearActions.inverse(change, mN);
    final long[] subgroup = Arrays.stream(generators)
      .map(g -> BinaryLinearActions.multiply(BinaryLinearActions.multiply(inverse, g, mN), change, mN)).toArray();
    if (a != b) {
      for (int i = 0; i < subgroup.length; ++i) {
        subgroup[i] = BinaryLinearActions.dual(subgroup[i], mN, a);
      }
    }
    final BinaryParabolicClasses.Located found = mParabolics[b].locate(subgroup);
    final long u = a == b ? found.mTransport : BinaryLinearActions.dual(found.mTransport, mN, b);
    return new Point(found.mIndex, BinaryLinearActions.multiply(change, u, mN));
  }

  private static int dimension(final int[] basis) {
    int n = 0;
    for (final int x : basis) {
      if (x != 0) {
        ++n;
      }
    }
    return n;
  }

  private static long[] compress(final long[] candidates, final int n, final long expected) {
    final List<Long> generators = new ArrayList<>();
    BinaryStrongChain chain = new BinaryStrongChain(n, new long[0]);
    for (final long candidate : candidates) {
      if (!chain.contains(candidate)) {
        generators.add(candidate);
        chain = new BinaryStrongChain(n, generators.stream().mapToLong(Long::longValue).toArray());
      }
    }
    if (chain.order() != expected) {
      throw new IllegalStateException("Wrong generated stabilizer order: " + chain.order() + " instead of " + expected);
    }
    return generators.stream().mapToLong(Long::longValue).toArray();
  }

  private void fuse(final int a) {
    final int b = Math.min(a, mN - a);
    final List<BinaryParabolicClasses.Subgroup> local = mParabolics[b].classes();
    mGlobal[a] = new int[local.size()];
    mRoutes[a] = new long[local.size()];
    Arrays.fill(mGlobal[a], -1);
    for (int i = 0; i < local.size(); ++i) {
      if (mGlobal[a][i] >= 0) {
        continue;
      }
      final BinaryParabolicClasses.Subgroup h = local.get(i);
      final long[] generators = orient(h.mGenerators, a);
      final List<int[]> invariant = minimalSpaces(generators);
      if (invariant.isEmpty()) {
        throw new IllegalStateException("A parabolic subgroup must be reducible");
      }
      if (dimension(invariant.get(0)) != a) {
        continue;
      }
      final List<Point> points = new ArrayList<>();
      int least = Integer.MAX_VALUE;
      for (final int[] space : invariant) {
        final Point it = point(generators, space, a, b);
        least = Math.min(least, it.mLocal);
        points.add(it);
      }
      final int current = mClasses.size();
      final List<Long> transports = new ArrayList<>();
      for (final Point p : points) {
        if (mGlobal[a][p.mLocal] < 0) {
          mGlobal[a][p.mLocal] = current;
          mRoutes[a][p.mLocal] = p.mTransport;
        } else if (mGlobal[a][p.mLocal] != current) {
          throw new IllegalStateException("Intersecting ambient subgroup classes");
        }
        if (p.mLocal == least) {
          transports.add(p.mTransport);
        }
      }
      // The normalizer acts transitively on precisely the points with
      // the same pointed class, with stabilizer the pointed normalizer.
      final BinaryParabolicClasses.Subgroup representative = local.get(least);
      final long normalizerOrder = (long) transports.size() * representative.mNormalizerOrder;
      if (mOrder % normalizerOrder != 0 || representative.mOrder != h.mOrder || mGlobal[a][i] != current) {
        throw new IllegalStateException("Wrong ambient subgroup orbit");
      }
      final long change = transports.get(0);
      final long inverse = BinaryLinearActions.inverse(change, mN);
      final Set<Long> normalizer = new LinkedHashSet<>();
      for (final long x : orient(representative.mNormalizer, a)) {
        normalizer.add(BinaryLinearActions.multiply(BinaryLinearActions.multiply(change, x, mN), inverse, mN));
      }
      for (final long x : transports) {
        normalizer.add(BinaryLinearActions.multiply(x, inverse, mN));
      }
      mClasses.add(new Subgroup(generators, compress(normalizer.stream().mapToLong(Long::longValue).toArray(), mN, normalizerOrder),
        h.mOrder, normalizerOrder));
    }
  }

  private int timesX(final int v) {
    final int next = v << 1;
    return (next & (1 << mN)) == 0 ? next : next ^ 37; // x^5 + x^2 + 1
  }

  private void addSingerClasses() {
    // The irreducible proper maximal subgroup in GL(5,2) is
    // GammaL(1,32). Its only irreducible subgroups are the Singer
    // group and the whole semilinear group.
    long singer = 0;
    long frobenius = 0;
    for (int j = 0; j < mN; ++j) {
      singer |= (long) timesX(1 << j) << (mN * j);
      int value = 1;
      for (int k = 0; k < 2 * j; ++k) {
        value = timesX(value);
      }
      frobenius |= (long) value << (mN * j);
    }
    final long[] cyclic = {singer};
    final long[] semilinear = {singer, frobenius};
    final long[] general = BinaryLinearActions.generators(mN);
    final long order = (1 << mN) - 1;
    if (new BinaryStrongChain(mN, cyclic).order() != order
      || new BinaryStrongChain(mN, semilinear).order() != mN * order
      || new BinaryStrongChain(mN, general).order() != mOrder) {
      throw new IllegalStateException("Singer or general linear generator order mismatch");
    }
    mClasses.add(new Subgroup(cyclic, semilinear, order, mN * order));
    mClasses.add(new Subgroup(semilinear, semilinear, mN * order, mN * order));
    mClasses.add(new Subgroup(general, general, mOrder, mOrder));
  }

  List<Subgroup> classes() {
    return mClasses;
  }

  boolean irreducible(final Subgroup subgroup) {
    return minimalSpaces(subgroup.mGenerators).isEmpty();
  }

  long total() {
    return mClasses.stream().mapToLong(x -> mOrder / x.mNormalizerOrder).sum();
  }

  private long power(final long matrix, final int exponent) {
    long value = BinaryLinearActions.identity(mN);
    for (int i = 0; i < exponent; ++i) {
      value = BinaryLinearActions.multiply(value, matrix, mN);
    }
    return value;
  }

  Located locate(final long[] generators, final long order) {
    if (mN != 5) {
      throw new UnsupportedOperationException("Only dimension five supports ambient lookup");
    }
    final List<int[]> spaces = minimalSpaces(generators);
    if (!spaces.isEmpty()) {
      final int a = dimension(spaces.get(0));
      final Point point = point(generators, spaces.get(0), a, Math.min(a, mN - a));
      final int index = mGlobal[a][point.mLocal];
      if (index < 0 || mClasses.get(index).mOrder != order) {
        throw new IllegalStateException("Unknown ambient subgroup");
      }
      return new Located(index, BinaryLinearActions.multiply(point.mTransport,
        BinaryLinearActions.inverse(mRoutes[a][point.mLocal], mN), mN));
    }
    final int last = mClasses.size() - 1;
    final long id = BinaryLinearActions.identity(mN);
    if (order == mOrder) {
      return new Located(last, id);
    }
    final int period = (1 << mN) - 1;
    if (order != period && order != period * mN) {
      throw new IllegalStateException("Unexpected irreducible subgroup order");
    }
    final Set<Long> seen = new HashSet<>();
    final List<Long> elements = new ArrayList<>();
    seen.add(id);
    elements.add(id);
    long singer = 0;
    for (int i = 0; i < elements.size() && singer == 0; ++i) {
      for (final long g : generators) {
        final long x = BinaryLinearActions.multiply(elements.get(i), g, mN);
        if (seen.add(x)) {
          elements.add(x);
          if (power(x, period) == id) {
            singer = x;
            break;
          }
        }
      }
    }
    if (singer == 0) {
      throw new IllegalStateException("No Singer subgroup generator");
    }
    final long standard = mClasses.get(last - 2).mGenerators[0];
    for (int exponent = 1; exponent < period; ++exponent) {
      final long s = power(singer, exponent);
      int vector = 1;
      long t = 0;
      for (int j = 0; j < mN; ++j) {
        t |= (long) vector << (mN * j);
        vector = BinaryLinearActions.apply(s, vector, mN);
      }
      if (BinaryLinearActions.multiply(t, standard, mN) == BinaryLinearActions.multiply(s, t, mN)) {
        return new Located(order == period ? last - 2 : last - 1, t);
      }
    }
    throw new IllegalStateException("No Singer transporter");
  }
}
