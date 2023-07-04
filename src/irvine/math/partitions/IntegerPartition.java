package irvine.math.partitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;

/**
 * Generate integer partitions.  Uses algorithm <code>ZS1</code> described
 * in "Fast Algorithms for Generating Integer Partitions", Zoghbi and
 * Stojmenovic, Intern. J. Computer Math., vol 70, pp. 319--332.
 *
 * @author Sean A. Irvine
 */
public final class IntegerPartition {

  private static final int[] EMPTY = {};
  private final int[] mX;
  private boolean mFirst = true;
  private int mM = 0;
  private int mH = 0;

  /**
   * Construct a new object for getting the integer partitions of a number.
   *
   * @param n number
   * @exception IllegalArgumentException if <code>n</code> is not positive.
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
   * Return the next integer partition or null of all partitions have been
   * produced.
   *
   * @return integer partition or null if no further partition exist
   */
  public int[] next() {
    if (mFirst) {
      mFirst = false;
      return mX.length == 0 ? EMPTY : new int[] {mX[0]};
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
   *
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
   *
   * @param counts partition in counts form
   * @return order of partition
   */
  public static int ord(final int[] counts) {
    int ord = 1;
    for (int k = 1; k < counts.length; ++k) {
      if (counts[k] > 0) {
        ord = IntegerUtils.lcm(ord, k);
      }
    }
    return ord;
  }

  private static final List<Z> PARTITIONS = new ArrayList<>();

  private static void computeNext() {
    final int n = PARTITIONS.size();
    if (n <= 1) {
      PARTITIONS.add(Z.ONE);
      PARTITIONS.add(Z.ONE);
      return;
    }
    Z p = Z.ZERO;
    long k = 1;
    boolean sign = true;
    while (true) {
      final long delta = k * (3 * k - 1) / 2;
      if (n - delta < 0) {
        break;
      }
      p = p.signedAdd(sign, PARTITIONS.get(n - (int) delta));
      if (n - delta - k < 0) {
        break;
      }
      p = p.signedAdd(sign, PARTITIONS.get(n - (int) (delta + k)));
      ++k;
      sign = !sign;
    }
    PARTITIONS.add(p);
  }

  /**
   * Number of partitions.
   * @param index index to compute number of partitions for
   * @return number of partitions
   */
  public static Z partitions(final int index) {
    if (index < 0) {
      return Z.ZERO;
    }
    while (PARTITIONS.size() <= index) {
      computeNext();
    }
    return PARTITIONS.get(index);
  }

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /**
   * Return the number of standard Young tableaux corresponding to the given
   * row lengths (i.e., partition).
   * @param l row lengths
   * @return number of standard Young tableaux
   */
  public static Z numStandardYoungTableaux(final int[] l) {
    final Z f = FACTORIAL.factorial((int) IntegerUtils.sum(l));
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
   * Compute the dual of a partition.
   * @param p partition
   * @return dual of the partition
   */
  public static int[] dual(final int[] p) {
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
    return FACTORIAL.factorial(s).divide(m);
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
    return (IntegerUtils.sum(c) & 1) != (c.length & 1);
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
