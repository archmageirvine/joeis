package irvine.math.partition;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * Generate integer partitions.  Uses algorithm <code>ZS1</code> described
 * in "Fast Algorithms for Generating Integer Partitions", Zoghbi and
 * Stojmenovic, Intern. J. Computer Math., vol 70, pp. 319--332.
 * @author Sean A. Irvine
 */
public final class IntegerPartition {

  private static final int[] EMPTY = {};
  private final int[] mX;
  private boolean mFirst = true;
  private int mM = 0; // Index of last active value in the partition
  private int mH = 0; // Index of last non-1 value in the partition

  /**
   * Construct a new object for getting the integer partitions of a number.
   * @param n number
   * @exception IllegalArgumentException if <code>n</code> is negative.
   */
  public IntegerPartition(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    mX = new int[n];
    if (n > 0) {
      Arrays.fill(mX, 1);
      mX[0] = n;
    }
  }

  /**
   * Construct a new object for getting the integer partitions of a number.
   * @param n number
   * @param maxPart maximum part size
   * @exception IllegalArgumentException if <code>n</code> is negative.
   */
  public IntegerPartition(final int n, final int maxPart) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    final int m = Math.min(n, maxPart); // maximum value in partition
    mX = new int[n];
    if (n > 0) {
      Arrays.fill(mX, 1);
      int r = n;
      while (r > 0) {
        mX[mM++] = Math.min(r, m);
        r -= m;
      }
      --mM;
      mH = mM;
      while (mH >= 0 && mX[mH] == 1) {
        --mH;
      }
    }
  }

  /**
   * Compute the dual (or conjugate) of a partition.
   * @param p partition
   * @return dual of the partition
   */
  public static LongDynamicLongArray dual(final LongDynamicLongArray p) {
    final LongDynamicLongArray dual = new LongDynamicLongArray();
    for (long k = 0, j = p.length() - 1; k < p.get(0); ++k) {
      while (p.get(j) <= k) {
        --j;
      }
      dual.set(k, j + 1);
    }
    return dual;
  }

  /**
   * Concatenates two sorted small vectors, preserving order.
   * Used exclusively for combining two partitions.
   * For example: <code>merge([4,1,1], [6,3]) =&gt; [6,4,3,1,1]</code>.
   * @param p1 first partition
   * @param p2 second partition
   * @return merged partition
   */
  public static LongDynamicLongArray merge(final LongDynamicLongArray p1, final LongDynamicLongArray p2) {
    final LongDynamicLongArray v = new LongDynamicLongArray();
    final long len = p1.length() + p2.length();
    for (long i = 0, j = 0, k = 0; k < len; ++k) {
      if (i < p1.length() && j < p2.length()) {
        if (p1.get(i) >= p2.get(j)) {
          v.set(k, p1.get(i++));
        } else {
          v.set(k, p2.get(j++));
        }
      } else if (i < p1.length()) {
        v.set(k, p1.get(i++));
      } else {
        v.set(k, p2.get(j++));
      }
    }
    return v;
  }

  /**
   * Return the next integer partition or null if all partitions have been produced.
   * @return integer partition or null if no further partition exist
   */
  public int[] next() {
    if (mFirst) {
      mFirst = false;
      return mX.length == 0 ? EMPTY : Arrays.copyOf(mX, mM + 1);
    }
    if (mX.length == 0 || mX[0] == 1) {
      return null;
    }
    if (mX[mH] == 2) {
      ++mM;
      mX[mH--] = 1;
    } else {
      final int r = --mX[mH];
      int t = mM - mH + 1;
      while (t >= r) {
        mX[++mH] = r;
        t -= r;
      }
      if (t == 0) {
        mM = mH;
      } else {
        mM = mH + 1;
        if (t > 1) {
          mX[++mH] = t;
        }
      }
    }
    return Arrays.copyOf(mX, mM + 1);
  }

  /**
   * Convert a partition into an array with counts with parts of given size.
   * It is assumed the resulting array is large enough. Position 0 of the
   * array is always left as 0.
   * @param partition the partition
   * @param counts the count form
   */
  public static void toCountForm(final int[] partition, final int[] counts) {
    Arrays.fill(counts, 0);
    for (final int p : partition) {
      ++counts[p];
    }
  }

  /**
   * Compute the order of a partition in counts form.
   * @param counts partition in counts form
   * @return order of partition
   */
  public static int ord(final int[] counts) {
    int ord = 1;
    for (int k = 1; k < counts.length; ++k) {
      if (counts[k] > 0) {
        ord = Functions.LCM.i(ord, k);
      }
    }
    return ord;
  }

  /**
   * Return the number of standard Young tableaux corresponding to the given
   * row lengths (i.e., partition).
   * @param l row lengths
   * @return number of standard Young tableaux
   */
  public static Z numStandardYoungTableaux(final int[] l) {
    final Z f = Functions.FACTORIAL.z(Functions.SUM.l(l));
    Z d = Z.ONE;
    for (int i = 0; i < l.length; ++i) {
      Z t = Z.ONE;
      for (int j = 1; j <= l[i]; ++j) {
        long s = 0;
        for (int k = i + 1; k < l.length; ++k) {
          if (l[k] >= j) {
            ++s;
          }
        }
        t = t.multiply(1 + l[i] - j + s);
      }
      d = d.multiply(t);
    }
    return f.divide(d);
  }

  /**
   * Compute the dual (or conjugate) of a partition.
   * @param p partition
   * @return dual of the partition
   */
  public static int[] dual(final int[] p) {
    if (p.length == 0) {
      return p;
    }
    final int[] dual = new int[p[0]];
    for (int k = 0, j = p.length - 1; k < dual.length; ++k) {
      while (p[j] <= k) {
        --j;
      }
      dual[k] = j + 1;
    }
    return dual;
  }

  /**
   * Test if the first partition majorizes the second partition.
   * @param u partition
   * @param v partition
   * @return true if <code>u &gt;= v</code>
   */
  public static boolean ge(final int[] u, final int[] v) {
    int su = 0;
    int sv = 0;
    for (int k = 0; k < Math.min(u.length, v.length); ++k) {
      su += u[k];
      sv += v[k];
      if (su < sv) {
        return false;
      }
    }
    return true;
  }

  /**
   * Build an index from partitions to index in the default ordering.
   * @param n number to partition
   * @return mapping
   */
  public static Map<String, Integer> buildPartitionIndex(final int n) {
    final Map<String, Integer> map = new HashMap<>();
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    int c = -1;
    while ((p = part.next()) != null) {
      map.put(Arrays.toString(p), ++c);
    }
    return map;
  }

  /**
   * Concatenates two sorted small vectors, preserving order.
   * Used exclusively for combining two partitions.
   * For example: <code>merge([4,1,1], [6,3]) =&gt; [6,4,3,1,1]</code>.
   * @param p1 first partition
   * @param p2 second partition
   * @return merged partition
   */
  public static int[] merge(final int[] p1, final int[] p2) {
    final int[] v = new int[p1.length + p2.length];
    for (int i = 0, j = 0, k = 0; k < v.length; ++k) {
      if (i < p1.length && j < p2.length) {
        if (p1[i] >= p2[j]) {
          v[k] = p1[i++];
        } else {
          v[k] = p2[j++];
        }
      } else if (i < p1.length) {
        v[k] = p1[i++];
      } else {
        v[k] = p2[j++];
      }
    }
    return v;
  }

  /**
   * Return the automorphism size for the partition.
   * @param v permutation type (i.e., a partition)
   * @return count
   */
  public static Z aut(final int[] v) {
    Z m = Z.ONE;
    int k = 0;
    for (int i = 0; i < v.length; ++i) {
      final int t = v[i];
      k = i > 0 && t == v[i - 1] ? k + 1 : 1;
      m = m.multiply(t * (long) k);
    }
    return m;
  }

  /**
   * Return the count of the number of permutations of a particular type.
   * @param v permutation type (i.e., a partition)
   * @param mult multiplicative factor
   * @return count
   */
  public static Z permCount(final int[] v, final int mult) {
    Z m = Z.ONE;
    int s = 0;
    int k = 0;
    for (int i = 0; i < v.length; ++i) {
      final int t = v[i];
      k = i > 0 && t == v[i - 1] ? k + 1 : 1;
      final int u = mult * t;
      m = m.multiply(u * (long) k);
      s += u;
    }
    return Functions.FACTORIAL.z(s).divide(m);
  }

  /**
   * Return the count of the number of permutations of a particular type.
   * @param v permutation type (i.e., a partition)
   * @return count
   */
  public static Z permCount(final int[] v) {
    return permCount(v, 1);
  }

  /**
   * Test if this partition (in count form) is even.
   * @param c partition in count form
   * @return true iff the partition is even
   */
  public static boolean isEven(final int[] c) {
    return (Functions.SUM.l(c) & 1) != (c.length & 1);
  }

  /**
   * Return the crank of this partition.
   * @param p partition
   * @return crank
   */
  public static int crank(final int[] p) {
    if (p.length == 0) {
      return 0;
    }
    if (p[p.length - 1] != 1) {
      return p[0];
    }
    if (p[0] == 1) {
      return -p.length;
    }
    int k = p.length - 1;
    int w = 0;
    while (p[k] == 1) {
      --k;
      ++w;
    }
    int m = 0;
    while (p[m] > w) {
      ++m;
    }
    return m - w;
  }

  /**
   * Return the multiplicity of a partition.
   * See A072811 for a definition.
   * @param p partition
   * @return multiplicity
   */
  public static Z multiplicity(final int[] p) {
    Z m = Functions.FACTORIAL.z(p.length);
    long k = 1;
    for (int j = 1; j < p.length; ++j) {
      if (p[j] == p[j - 1]) {
        ++k;
      } else {
        m = m.divide(Functions.FACTORIAL.z(k));
        k = 1;
      }
    }
    return m.divide(Functions.FACTORIAL.z(k));
  }

  /**
   * Given a partition considered as a cycle type for a permutation, compute the cycle
   * type of any permutation of this cycle type raised to the <code>n</code>th power.
   * @param p cycle type
   * @param n power
   * @return cycle type
   */
  public static int[] power(final int[] p, final int n) {
    if (n == 1) {
      return p;
    }
    final int[] e = new int[Functions.SUM.i(p)];
    int units = 0;
    for (int k = 0, j = 0; k < p.length; ++k) {
      final int s = j;
      if (p[k] == 1) {
        ++units;
      }
      for (int i = 0; i < p[k]; ++i) {
        e[j++] = s + (i + 1) % p[k];
      }
    }
    final IntegerPermutation perm = new IntegerPermutation(e);
    IntegerPermutation pn = perm;
    for (int k = 1; k < n; ++k) {
      pn = pn.compose(perm);
    }
    final List<int[]> cycles = IntegerPermutation.toCycles(pn.getPerm());
    // Restore missing unit cycles
    for (int k = 0; k < units; ++k) {
      cycles.add(new int[] {1});
    }
    final int[] res = new int[cycles.size()];
    int q = 0;
    for (final int[] c : cycles) {
      res[q++] = c.length;
    }
    Arrays.sort(res);
    for (int left = 0, right = res.length - 1; left < right; ++left, --right) {
      final int t = res[left];
      res[left] = res[right];
      res[right] = t;
    }
    return res;
  }

  /**
   * Print all integer partitions of given argument.
   * @param args arguments
   */
  public static void main(final String[] args) {
    final IntegerPartition ip = new IntegerPartition(Integer.parseInt(args[0]));
    int[] part;
    while ((part = ip.next()) != null) {
      System.out.println(Arrays.toString(part));
    }
  }
}
