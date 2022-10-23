package irvine.oeis.a007;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007456 Number of days required to spread gossip to n people.
 * @author Sean A. Irvine
 */
public class A007456 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(LongUtils.lg(mN - 1) + ((mN - 2) & 1) + 1);
  }
}

