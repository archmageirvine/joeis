package irvine.oeis.a267;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A267597 Number of sum-product knapsack partitions of n. Number of integer partitions y of n such that every sum of products of the parts of a multiset partition of any submultiset of y is distinct.
 * @author Sean A. Irvine
 */
public class A267597 extends Sequence0 {

  private int mN = -1;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private long product(final int[] p, final long bits) {
    long prod = 1;
    for (int k = 0; k < p.length; ++k) {
      if ((bits & (1L << k)) != 0) {
        prod *= p[k];
      }
    }
    return prod;
  }

  private String key(final int[] p, final long bits) {
    final StringBuilder key = new StringBuilder();
    for (int k = 0; k < p.length; ++k) {
      if ((bits & (1L << k)) != 0) {
        if (key.length() > 0) {
          key.append(',');
        }
        key.append(p[k]);
      }
    }
    return key.toString();
  }

  private boolean search(final HashSet<Long> seen, final int[] p, final long used, final long prev, final long sum) {
    if (Long.bitCount(used) < p.length) {
      final HashSet<String> forbidden = new HashSet<>(); // Avoid retrying same subset
      for (long set = prev + 1; set < 1L << p.length; ++set) {
        if ((set & used) == 0) {
          // Set selects entries from p not yet used
          final String key = key(p, set);
          if (forbidden.add(key)) {
            final long s = sum + product(p, set);
            if (!seen.add(s)) {
              return false;
            }
            search(seen, p, used | set, set, s);
          }
        }
      }
    }
    return true;
  }

  private boolean isSumProductKnapsack(final int[] p) {
    return search(new HashSet<>(), p, 0, 0, 0);
  }

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ONE;
    }
    long cnt = 0;
    final IntegerPartition partition = new IntegerPartition(mN);
    int[] p;
    while ((p = partition.next()) != null) {
      if (isSumProductKnapsack(p)) {
        if (mVerbose) {
          StringUtils.message("Accepted: " + Arrays.toString(p));
        }
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }

}
