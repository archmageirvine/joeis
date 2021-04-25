package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046804 Primes p modulo t where t = terminal digit of p.
 * @author Sean A. Irvine
 */
public class A046804 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.mod(p.mod(Z.TEN));
  }
}
