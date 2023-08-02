package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003956 Order of complex Clifford group of degree 2^n arising in quantum coding theory.
 * @author Sean A. Irvine
 */
public class A003956 extends Sequence0 {

  private Z mA = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(2L * mN).subtract(1));
    }
    return mA.shiftLeft((long) mN * mN + 2L * mN + 3);
  }
}
