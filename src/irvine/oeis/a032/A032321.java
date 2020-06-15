package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a001.A001037;

/**
 * A032321 Number of aperiodic necklaces with n labeled beads of 2 colors.
 * @author Sean A. Irvine
 */
public class A032321 extends A001037 {

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
