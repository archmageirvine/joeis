package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020547 2nd Euler polynomial evaluated at x=n!.
 * @author Sean A. Irvine
 */
public class A020547 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(mF.subtract(1));
  }
}
