package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001971 Nearest integer to n^2/8.
 * @author Sean A. Irvine
 */
public class A001971 extends Sequence0 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(5).subtract(mN.multiply2()).shiftRight(3);
  }
}
