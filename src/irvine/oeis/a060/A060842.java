package irvine.oeis.a060;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060842 a(n) = (binomial(2*p,p)-2)/p^2 where p = prime(n).
 * @author Sean A. Irvine
 */
public class A060842 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Binomial.binomial(p.multiply2(), p).subtract(2).divide(p.square());
  }
}
