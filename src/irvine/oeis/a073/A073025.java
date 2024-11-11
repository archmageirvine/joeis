package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A073025 Primes p such that p-1 has a prime factor q &gt; p^(3/4).
 * @author Sean A. Irvine
 */
public class A073025 extends A065091 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z[] q = Jaguar.factor(p.subtract(1)).toZArray();
      if (q[q.length - 1].pow(4).compareTo(p.pow(3)) > 0) {
        return p;
      }
    }
  }
}
