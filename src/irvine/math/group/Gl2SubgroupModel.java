package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Compact matrix and subgroup representations for the degree-two census.
 * @author Gregory Morse
 */
final class Gl2SubgroupModel {

  private Gl2SubgroupModel() { }

  static final class Group {
    final int mModulus;
    final int mIdentity;
    final int mLimit;
    final int mOrder;
    final int[] mInverses;
    final boolean mProjective;
    private final int mSquare;
    private final int mCube;
    private final int mShift;
    private final int mMask;

    Group(final int n, final boolean projective) {
      mModulus = n;
      mProjective = projective;
      mSquare = Math.multiplyExact(n, n);
      mCube = Math.multiplyExact(n, mSquare);
      mLimit = Math.multiplyExact(n, mCube);
      mShift = Integer.numberOfTrailingZeros(n);
      mMask = (n & (n - 1)) == 0 ? n - 1 : 0;
      mIdentity = pack(1, 0, 0, 1);
      mInverses = new int[n];
      long order = 1;
      int m = n;
      for (int p = 2; p <= m; ++p) {
        if (m % p == 0) {
          m /= p;
          order *= (long) p * (p - 1) * ((long) p * p - 1);
          while (m % p == 0) {
            m /= p;
            order *= (long) p * p * p * p;
          }
        }
      }
      for (int a = 1; a < n; ++a) {
        for (int b = 1; b < n; ++b) {
          if (a * b % n == 1) {
            mInverses[a] = b;
            break;
          }
        }
      }
      mOrder = Math.toIntExact(projective ? order / (n - 1) : order);
    }

    int pack(final int a, final int b, final int c, final int d) {
      if (mMask != 0) {
        return ((a & mMask) << (3 * mShift)) | ((b & mMask) << (2 * mShift))
          | ((c & mMask) << mShift) | (d & mMask);
      }
      return Math.floorMod(a, mModulus) * mCube + Math.floorMod(b, mModulus) * mSquare
        + Math.floorMod(c, mModulus) * mModulus + Math.floorMod(d, mModulus);
    }

    int entry(final int x, final int i) {
      if (mMask != 0) {
        return (x >>> ((3 - i) * mShift)) & mMask;
      }
      switch (i) {
        case 0: return x / mCube;
        case 1: return (x / mSquare) % mModulus;
        case 2: return (x / mModulus) % mModulus;
        default: return x % mModulus;
      }
    }

    int[] entries(final int x) {
      return new int[] {entry(x, 0), entry(x, 1), entry(x, 2), entry(x, 3)};
    }

    int resize(final int x, final Group target) {
      return target.pack(entry(x, 0), entry(x, 1), entry(x, 2), entry(x, 3));
    }

    int scale(final int s, final int x) {
      return pack(s * entry(x, 0), s * entry(x, 1), s * entry(x, 2), s * entry(x, 3));
    }

    int leading(final int x) {
      for (int k = 0; k < 3; ++k) {
        final int a = entry(x, k);
        if (a != 0) {
          return a;
        }
      }
      return entry(x, 3);
    }

    int project(final int x) {
      return scale(mInverses[leading(x)], x);
    }

    int rawMultiply(final int x, final int y) {
      final int a = entry(x, 0);
      final int b = entry(x, 1);
      final int c = entry(x, 2);
      final int d = entry(x, 3);
      final int e = entry(y, 0);
      final int f = entry(y, 1);
      final int g = entry(y, 2);
      final int h = entry(y, 3);
      return pack(a * e + b * g, a * f + b * h, c * e + d * g, c * f + d * h);
    }

    int multiply(final int x, final int y) {
      final int z = rawMultiply(x, y);
      return mProjective ? project(z) : z;
    }

    int rawInverse(final int x) {
      final int a = entry(x, 0);
      final int b = entry(x, 1);
      final int c = entry(x, 2);
      final int d = entry(x, 3);
      final int t = a * d - b * c;
      final int s = mInverses[mMask != 0 ? t & mMask : Math.floorMod(t, mModulus)];
      return pack(s * d, -s * b, -s * c, s * a);
    }

    int inverse(final int x) {
      final int y = rawInverse(x);
      return mProjective ? project(y) : y;
    }

    int conjugate(final int x, final int s, final int inverse) {
      return multiply(multiply(s, x), inverse);
    }

    int pow(int a, int n) {
      int result = mIdentity;
      for (; n > 0; n >>>= 1) {
        if ((n & 1) != 0) {
          result = multiply(result, a);
        }
        a = multiply(a, a);
      }
      return result;
    }

    int[] allElements() {
      final int[] result = new int[mOrder];
      int end = 0;
      for (int x = 1; x < mLimit; ++x) {
        if ((!mProjective || leading(x) == 1) && rawInverse(x) != 0) {
          result[end++] = x;
        }
      }
      if (end != result.length) {
        throw new IllegalStateException("Incorrect group order");
      }
      return result;
    }
  }

  static final class IntKey {
    private final int[] mValues;
    private final int mHash;

    IntKey(final int[] values) {
      mValues = values;
      mHash = Arrays.hashCode(values);
    }

    @Override
    public boolean equals(final Object other) {
      return other instanceof IntKey && Arrays.equals(mValues, ((IntKey) other).mValues);
    }

    @Override
    public int hashCode() {
      return mHash;
    }
  }

  static final class Subgroup {
    final int[] mGenerators;
    final int[] mNormalizer;
    final int mOrder;
    final int mNormalizerOrder;

    Subgroup(final int[] generators, final int[] normalizer, final int order, final int normalizerOrder) {
      mGenerators = generators;
      mNormalizer = normalizer;
      mOrder = order;
      mNormalizerOrder = normalizerOrder;
    }
  }

  static final class Generated {
    private final Group mGroup;
    private final BitSet mSet = new BitSet();
    final List<Integer> mElements = new ArrayList<>();
    final List<Integer> mGenerators = new ArrayList<>();

    Generated(final Group group) {
      mGroup = group;
      mSet.set(group.mIdentity);
      mElements.add(group.mIdentity);
    }

    void add(final int generator) {
      if (!mSet.get(generator)) {
        mGenerators.add(generator);
        final int oldSize = mElements.size();
        final List<Integer> cosets = new ArrayList<>();
        cosets.add(mGroup.mIdentity);
        // With H the previous group, the cosets Hx are well-defined
        // under right multiplication. Enumerate each new coset once.
        for (int i = 0; i < cosets.size(); ++i) {
          final int a = cosets.get(i);
          for (final int b : mGenerators) {
            final int x = mGroup.multiply(a, b);
            if (!mSet.get(x)) {
              cosets.add(x);
              for (int j = 0; j < oldSize; ++j) {
                final int y = mGroup.multiply(mElements.get(j), x);
                mSet.set(y);
                mElements.add(y);
              }
            }
          }
        }
      }
    }

    int[] generators() {
      return toArray(mGenerators);
    }
  }

  static int[] toArray(final List<Integer> list) {
    return list.stream().mapToInt(Integer::intValue).toArray();
  }

  static int[] append(final int[] generators, final int g) {
    final int[] all = Arrays.copyOf(generators, generators.length + 1);
    all[generators.length] = g;
    return all;
  }

  static int[] elements(final Group g, final int[] generators) {
    final Generated result = new Generated(g);
    for (final int gn : generators) {
      result.add(gn);
    }
    return toArray(result.mElements);
  }

  static final class Classes {
    private final Group mGroup;
    private final int[] mGenerators;
    private final int[] mInverses;
    final List<Subgroup> mRepresentatives = new ArrayList<>();
    private final Set<IntKey> mSeen = new HashSet<>();

    Classes(final Group group, final int[] generators) {
      mGroup = group;
      mGenerators = generators;
      mInverses = Arrays.stream(generators).map(group::inverse).toArray();
    }

    void offer(final int[] generators) {
      final int[] es = elements(mGroup, generators);
      Arrays.sort(es);
      final IntKey root = new IntKey(es);
      if (!mSeen.add(root)) {
        return;
      }
      final Map<IntKey, Integer> transport = new HashMap<>();
      transport.put(root, mGroup.mIdentity);
      final List<int[]> queue = new ArrayList<>();
      final List<Integer> conjugators = new ArrayList<>();
      queue.add(es);
      conjugators.add(mGroup.mIdentity);
      final Generated stabilizer = new Generated(mGroup);
      for (int i = 0; i < queue.size(); ++i) {
        final int[] old = queue.get(i);
        for (int k = 0; k < mGenerators.length; ++k) {
          final int a = mGenerators[k];
          final int b = mInverses[k];
          final int[] next = Arrays.stream(old).map(x -> mGroup.conjugate(x, a, b)).toArray();
          Arrays.sort(next);
          final IntKey key = new IntKey(next);
          final int t = mGroup.multiply(a, conjugators.get(i));
          final Integer known = transport.putIfAbsent(key, t);
          if (known == null) {
            queue.add(next);
            conjugators.add(t);
            mSeen.add(key);
          } else {
            stabilizer.add(mGroup.multiply(mGroup.inverse(known), t));
          }
        }
      }
      final int normalizerOrder = stabilizer.mElements.size();
      if ((long) normalizerOrder * queue.size() != mGroup.mOrder) {
        throw new IllegalStateException("Incorrect subgroup stabilizer");
      }
      mRepresentatives.add(new Subgroup(generators, stabilizer.generators(), es.length, normalizerOrder));
    }
  }

  static List<Subgroup> small(final Group group) {
    final int[] all = group.allElements();
    final Generated ambient = new Generated(group);
    for (final int x : all) {
      ambient.add(x);
    }
    final Classes classes = new Classes(group, ambient.generators());
    classes.offer(new int[0]);
    for (int i = 0; i < classes.mRepresentatives.size(); ++i) {
      final Subgroup p = classes.mRepresentatives.get(i);
      final int[] es = elements(group, p.mGenerators);
      final Set<Integer> seen = new HashSet<>();
      for (final int x : es) {
        seen.add(x);
      }
      // Right cosets of the parent are sufficient for adjoining
      // another generator. Generate each subgroup up to conjugacy.
      for (final int x : all) {
        if (!seen.contains(x)) {
          for (final int s : es) {
            seen.add(group.multiply(s, x));
          }
          classes.offer(append(p.mGenerators, x));
        }
      }
    }
    return classes.mRepresentatives;
  }
}
