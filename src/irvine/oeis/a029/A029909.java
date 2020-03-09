package irvine.oeis.a029;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A029909 Starting with <code>n</code> (but omitting the primes), repeatedly sum prime factors (counted with multiplicity) until reaching a limit.
 * @author Sean A. Irvine
 */
public class A029909 extends A018252 {

  @Override
  public Z next() {
    Z m = super.next();
    Z prev;
    do {
      prev = m;
      m = Cheetah.factor(m).sopfr();
    } while (!Z.ZERO.equals(m) && !prev.equals(m));
    return m;
  }
}
