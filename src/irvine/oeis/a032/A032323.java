package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a027.A027377;

/**
 * A032323 Number of aperiodic necklaces with n labeled beads of 4 colors.
 * @author Sean A. Irvine
 */
public class A032323 extends A027377 {

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
