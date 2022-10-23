package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046914 Sum of aliquot factors (divisors excluding the number itself) of 10^n.
 * @author Sean A. Irvine
 */
public class A046914 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN + 1).subtract(1).multiply(Z.FIVE.pow(mN + 1).subtract(1)).divide(4).subtract(Z.TEN.pow(mN));
  }
}

