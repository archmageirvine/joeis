package irvine.oeis.a035;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035421 Related to Rogers-Ramanujan Identities.
 * @author Sean A. Irvine
 */
public class A035421 extends Sequence1 {

  private long mM = 0;
  private final IntegerPartition mPart = new IntegerPartition(10000000);

  private boolean is(final int[] p) {
    if (p[p.length - 1] < 2) {
      return false;
    }
    for (int k = 1; k < p.length; ++k) {
      if (p[k - 1] - p[k] < 2) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mM;
      if (is(mPart.next())) {
        return Z.valueOf(mM);
      }
    }
  }
}

