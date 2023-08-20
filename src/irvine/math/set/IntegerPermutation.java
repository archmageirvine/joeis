package irvine.math.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;

/**
 * Hold a permutation of integers.  These permutations start at 0 rather
 * than the usual 1.
 * @author Sean A. Irvine
 */
public class IntegerPermutation implements Comparable<IntegerPermutation> {

  /**
   * Calculates common degree of the specified permutations; that is,
   * the largest point moved by the permutations plus one.
   * @param permutations permutations
   * @return larges point moved by specified permutations plus one
   */
  public static int degree(final List<IntegerPermutation> permutations) {
    int r = 0;
    for (final IntegerPermutation p : permutations) {
      r = Math.max(r, p.degree());
    }
    return r;
  }

  private final int[] mPerm;

  /**
   * Create a permutation starting from a 1-based representation
   * @param perm the 1-based permutation
   * @return the 0-based permutation
   */
  public static IntegerPermutation createFromOneBase(final int... perm) {
    final int[] c = Arrays.copyOf(perm, perm.length);
    for (int k = 0; k < c.length; ++k) {
      --c[k];
    }
    return new IntegerPermutation(c);
  }

  /**
   * Construct the identity (or zero) of given length.
   * @param length length to construct
   * @return identity permutation
   */
  public static IntegerPermutation identity(final int length) {
    return new IntegerPermutation(IntegerUtils.identity(new int[length]));
  }

  /**
   * Construct a new 0-based permutation
   * @param perm the permutation
   */
  public IntegerPermutation(final int... perm) {
    mPerm = perm;
  }

  /**
   * Construct a new 0-based permutation
   * @param perm the permutation
   */
  public IntegerPermutation(final byte... perm) {
    mPerm = new int[perm.length];
    for (int k = 0; k < perm.length; ++k) {
      mPerm[k] = perm[k] & 0xFF;
    }
  }

  /**
   * Count the number of cycles in the given permutation.
   * @param p the permutation
   * @param minLength minimum length of cycle to count
   * @return number of cycles
   */
  public static int countCycles(final int[] p, final int minLength) {
    final boolean[] seen = new boolean[p.length];
    int cycleCount = 0;
    for (int k = 0; k < p.length; ++k) {
      if (!seen[k]) {
        int j = k;
        int len = 0;
        do {
          ++len;
          seen[j] = true;
          j = p[j];
        } while (!seen[j]);
        if (len >= minLength) {
          ++cycleCount;
        }
      }
    }
    return cycleCount;
  }

  /**
   * Count the number of cycles in the given permutation.
   * @param p the permutation
   * @return number of cycles
   */
  public static int countCycles(final int[] p) {
    return countCycles(p, 2);
  }

  /**
   * Compute the least common multiple of the cycle sizes of the permutation.
   * @param p the permutation
   * @return least common multiple of cycle sizes
   */
  public static Z lcmCycleSizes(final int[] p) {
    final boolean[] seen = new boolean[p.length];
    Z lcm = Z.ONE;
    for (int k = 0; k < p.length; ++k) {
      if (!seen[k]) {
        int j = k;
        int len = 0;
        do {
          ++len;
          seen[j] = true;
          j = p[j];
        } while (!seen[j]);
        lcm = lcm.lcm(Z.valueOf(len));
      }
    }
    return lcm;
  }

  /**
   * Compute the maximum cycle size of the permutation.
   * @param p the permutation
   * @return maximum cycle size
   */
  public static int maximumCycleSize(final int[] p) {
    final boolean[] seen = new boolean[p.length];
    int max = 0;
    for (int k = 0; k < p.length; ++k) {
      if (!seen[k]) {
        int j = k;
        int len = 0;
        do {
          ++len;
          seen[j] = true;
          j = p[j];
        } while (!seen[j]);
        if (len > max) {
          max = len;
        }
      }
    }
    return max;
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof IntegerPermutation)) {
      return false;
    }
    final IntegerPermutation other = (IntegerPermutation) obj;
    final int d = degree();
    final int e = other.degree();
    if (d != e) {
      return false;
    }
    for (int k = 0; k < d; ++k) {
      if (image(k) != other.image(k)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Return an integer array version of this pemutation.
   * @return permutation
   */
  public int[] getPerm() {
    return Arrays.copyOf(mPerm, mPerm.length);
  }

  @Override
  public String toString() {
    return Arrays.toString(mPerm);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(mPerm);
  }

  @Override
  public int compareTo(final IntegerPermutation b) {
    for (int k = 0; k < mPerm.length; ++k) {
      final int c = Integer.compare(mPerm[k], b.image(k));
      if (c != 0) {
        return c;
      }
    }
    return 0;
  }

  /**
   * Image of point.
   * @param key point to get image of
   * @return image
   */
  public int image(final int key) {
    return key < mPerm.length ? mPerm[key] : key;
  }

  /**
   * Test if this permutation is the identity permutation.
   * @return true iff is the identity permutation
   */
  public boolean isIdentity() {
    for (int k = 0; k < mPerm.length; ++k) {
      if (mPerm[k] != k) {
        return false;
      }
    }
    return true;
  }

  /**
   * Perform composition of permutations
   * @param other other permutation
   * @return this permutation composed with the given permutation
   */
  public IntegerPermutation compose(final IntegerPermutation other) {
    final int[] r = new int[Math.max(degree(), other.degree())];
    for (int k = 0; k < r.length; ++k) {
      r[k] = other.image(image(k));
    }
    return new IntegerPermutation(r);
  }

  /**
   * Construct the inverse of this permutation.
   * @return inverse permutation
   */
  public IntegerPermutation inverse() {
    final int[] r = new int[mPerm.length];
    for (int k = 0; k < r.length; ++k) {
      r[mPerm[k]] = k;
    }
    return new IntegerPermutation(r);
  }

  /**
   * The largest non-fixed element of the permutation.
   * @return degree
   */
  public int degree() {
    int k;
    for (k = mPerm.length - 1; k >= 0; --k) {
      if (mPerm[k] != k) {
        break;
      }
    }
    return k + 1;
  }

  /**
   * Size of the permutation.
   * @return size
   */
  public int size() {
    return mPerm.length;
  }

  /**
   * Return the order of this permutation (least common multiple of cycle lengths).
   * @return order of permutation
   */
  public Z order() {
    final boolean[] seen = new boolean[size()];
    Z lcm = Z.ONE;
    for (int k = 0; k < mPerm.length; ++k) {
      if (!seen[k]) {
        int j = k;
        int len = 0;
        do {
          ++len;
          seen[j] = true;
          j = mPerm[j];
        } while (!seen[j]);
        lcm = lcm.lcm(Z.valueOf(len));
      }
    }
    return lcm;
  }

  /**
   * Return this permutation with the given elements swapped.
   * Equivalent to composition with <code>(i-1,j-1)</code>.
   * @param i first element
   * @param j second element
   * @return swap
   */
  public IntegerPermutation swap(final int i, final int j) {
    final IntegerPermutation copy = new IntegerPermutation(Arrays.copyOf(mPerm, size()));
    copy.mPerm[i] = image(j);
    copy.mPerm[j] = image(i);
    return copy;
  }

  private Z permRank3Aux(final int n, final IntegerPermutation p, final IntegerPermutation q) {
    if (n <= 1) {
      return Z.ZERO;
    }
    final Z t = MemoryFactorial.SINGLETON.factorial(n - 1).multiply(n - p.image(n - 1) - 1);
    return t.add(permRank3Aux(n - 1, p.swap(n - 1, q.image(n - 1)), q.swap(n - 1, p.image(n - 1))));
  }

  /**
   * Convert this permutation to an integer.
   * @return integer
   */
  public Z permRank3R() {
    return permRank3Aux(size(), this, inverse());
  }

  /**
   * Return the reverse lexical rank of a permutation.
   * @return lexical rank
   */
  public Z permRevLexRank() {
    final int n = size();
    final int[] p = new int[n];
    for (int k = 0; k < p.length; ++k) {
      p[k] = image(k) + 1;
    }
    Z r = Z.ZERO;
    for (int j = n - 1; j >= 0; --j) {
      r = r.add(MemoryFactorial.SINGLETON.factorial(j).multiply(j + 1 - p[j]));
      for (int i = 0; i < j; ++i) {
        if (p[i] > p[j]) {
          --p[i];
        }
      }
    }
    return r;
  }

  /**
   * Return the site swap representation of this permutation.
   * @return site swap representation
   */
  public int[] toSiteSwap() {
    final IntegerPermutation inv = inverse();
    final int[] a = new int[size()];
    for (int k = 0; k < a.length; ++k) {
      a[k] = (inv.image(k) + a.length - k) % a.length;
    }
    return a;
  }

  /**
   * Return the permutation as cycles (including fixed points).
   * @param p the permutation
   * @return cycle notation
   */
  public static List<int[]> toCycles(final int[] p) {
    final boolean[] seen = new boolean[p.length];
    final ArrayList<int[]> cycles = new ArrayList<>();
    for (final int k : p) {
      if (!seen[k]) {
        final ArrayList<Integer> cyc = new ArrayList<>();
        int j = k;
        do {
          seen[j] = true;
          cyc.add(j);
          j = p[j];
        } while (!seen[j]);
        cycles.add(IntegerUtils.toArray(cyc));
      }
    }
    return cycles;
  }

  private static List<Long> factorialBase(long n) {
    final ArrayList<Long> res = new ArrayList<>();
    long f = 2;
    int k = 2;
    while (f <= n) {
      f *= ++k;
    }
    while (k > 1) {
      f /= k--;
      final long q = n / f;
      res.add(q);
      n -= q * f;
    }
    return res;
  }

  private static IntegerPermutation permUnrank3RAux(final int n, final int r, final IntegerPermutation p) {
    if (r == 0) {
      return p;
    }
    final int f = MemoryFactorial.SINGLETON.factorial(n - 1).intValueExact();
    final int s = r / f;
    final int[] q = IntegerUtils.identity(new int[n]);
    q[n - 1] = n - s - 1;
    q[n - s - 1] = n - 1;
    return permUnrank3RAux(n - 1, r - s * f, new IntegerPermutation(q).compose(p));
  }

  /**
   * Decode an integer as a permutation.
   * @param r integer
   * @return permutation
   */
  public static IntegerPermutation permUnrank3R(final int r) {
    final int n = factorialBase(r).size();
    return permUnrank3RAux(n + 1, r, new IntegerPermutation());
  }
}
