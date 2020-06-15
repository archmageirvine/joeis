package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a027.A027376;

/**
 * A032322 Number of aperiodic necklaces with n labeled beads of 3 colors.
 * @author Sean A. Irvine
 */
public class A032322 extends A027376 {

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
