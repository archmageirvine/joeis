package irvine.oeis.a060;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060497 a(n) = binomial(2^n, prime(n)).
 * @author Sean A. Irvine
 */
public class A060497 extends A000040 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply2();
    return Binomial.binomial(mA, super.next());
  }
}
