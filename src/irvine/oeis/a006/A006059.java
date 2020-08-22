package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a001.A001035;

/**
 * A006059 Number of connected labeled T_0-T_4-topologies with n points.
 * @author Sean A. Irvine
 */
public class A006059 extends A001035 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return super.next().multiply(mN);
  }
}

