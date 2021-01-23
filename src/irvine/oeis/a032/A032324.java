package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a001.A001692;

/**
 * A032324 Number of aperiodic necklaces with n labeled beads of 5 colors.
 * @author Sean A. Irvine
 */
public class A032324 extends A001692 {

  private long mN = 0;
  private Z mF = Z.ONE;
  {
    super.next();
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return super.next().multiply(mF);
  }
}
