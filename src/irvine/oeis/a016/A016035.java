package irvine.oeis.a016;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016035.
 * @author Sean A. Irvine
 */
public class A016035 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Z.valueOf(mN - LongUtils.phi(mN) - 1);
  }
}
