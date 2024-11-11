package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A073024 Primes p such that p-1 has a prime factor q &gt; p^(2/3).
 * @author Sean A. Irvine
 */
public class A073024 extends A065091 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z[] q = Jaguar.factor(p.subtract(1)).toZArray();
      if (q[q.length - 1].pow(3).compareTo(p.square()) > 0) {
        return p;
      }
    }
  }
}
