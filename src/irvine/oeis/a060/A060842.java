package irvine.oeis.a060;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060842 (C(2p,p)-2)/p^2 where p runs through the primes.
 * @author Sean A. Irvine
 */
public class A060842 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Binomial.binomial(p.multiply2(), p).subtract(2).divide(p.square());
  }
}
