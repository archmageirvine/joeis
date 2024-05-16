package irvine.oeis.a098;

import irvine.math.z.Z;
import irvine.oeis.a019.A019518;

/**
 * A098130 Concatenation of consecutive primes in the forward and reverse order.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A098130 extends A019518 {

  @Override
  public Z next() {
    final String t = super.next().toString();
    return new Z(t + new StringBuilder(t).reverse());
  }
}
