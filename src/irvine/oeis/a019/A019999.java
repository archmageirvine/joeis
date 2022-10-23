package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019999 Number of similarity classes of descendants created by bisection refinement from an initial n-simplex.
 * @author Sean A. Irvine
 */
public class A019999 extends Sequence0 {

  private Z mF = Z.ONE;
  private int mN = 1;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(mN).shiftLeft(mN - 2);
  }
}
