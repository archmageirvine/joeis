package irvine.oeis.a067;

import java.util.Arrays;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003056;

/**
 * A067627 Triangle T(n,k) = number of conjugacy classes of partitions of n using only k types of piles, read by rows.
 * @author Sean A. Irvine
 */
public class A067627 extends Sequence1 {

  private final Sequence mLengths = new A003056();
  private int mM = mLengths.next().intValueExact();
  private int mN = 0;

  private int distinct(final int[] p) {
    int cnt = 0;
    int prev = -1;
    for (final int v : p) {
      if (v != prev) {
        prev = v;
        ++cnt;
      }
    }
    return cnt;
  }

  private long t(final int n, final int k) {
    long a = 0;
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      if (distinct(p) == k) {
        final int[] pc = IntegerPartition.dual(p);
        if (Arrays.compare(p, pc) <= 0) {
          ++a;
        }
      }
    }
    return a;
  }

  @Override
  public Z next() {
    if (--mM <= 0) {
      ++mN;
      mM = mLengths.next().intValueExact();
    }
    return Z.valueOf(t(mN, mM));
  }
}
