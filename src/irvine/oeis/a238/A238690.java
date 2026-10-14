package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a085.A085082;
import irvine.oeis.a108.A108951;

/**
 * A238690 Let each integer m (1 &lt;= m &lt;= n) be factorized as m = prime_m(1)*prime_m(2)*...*prime_m(bigomega(m)), with the primes sorted in nonincreasing order. Then a(n) is the number of values of m such that each prime_m(i) &lt;= prime_n(i).
 * @author Sean A. Irvine
 */
public class A238690 extends A108951 {

  private final DirectSequence mA = new A085082();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
