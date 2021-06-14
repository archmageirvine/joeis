package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a003.A003714;

/**
 * A048297 Coefficients in power series expansion over GF(2)[ X^(-1) ] of continued fraction [ 0, X, X^2, X^4, X^8, X^16, ... ].
 * @author Sean A. Irvine
 */
public class A048297 extends A003714 {

  @Override
  public Z next() {
    return super.next().multiply(3).add(1);
  }
}
