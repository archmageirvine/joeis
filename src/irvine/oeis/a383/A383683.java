package irvine.oeis.a383;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383683 The number of possible values that can be obtained for the Shannon diversity index across all partitions of n.
 * @author Sean A. Irvine
 */
public class A383683 extends Sequence0 {

  private static final int ACCURACY = -200;
  private int mN = -1;
  private final ArrayList<CR> mLogs = new ArrayList<>();
  {
    mLogs.add(null); // log 0
  }

  private CR nlogn(final int n) {
    while (n >= mLogs.size()) {
      mLogs.add(CR.valueOf(mLogs.size()).log().multiply(mLogs.size()));
    }
    return mLogs.get(n);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE; // avoid log 0
    }
    final IntegerPartition part = new IntegerPartition(mN);
    final TreeSet<CR> seen = new TreeSet<>((s, t) -> s.compareTo(t, ACCURACY));
    int[] p;
    final CR nlogn = nlogn(mN);
    while ((p = part.next()) != null) {
      CR sum = nlogn;
      for (final int v : p) {
        sum = sum.subtract(nlogn(v));
      }
      seen.add(sum);
    }
    return Z.valueOf(seen.size());
  }
}

