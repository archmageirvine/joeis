package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A073026 Primes p such that p-1 has a prime factor q with (p-1)/2 &gt; q &gt; p^(3/4).
 * @author Sean A. Irvine
 */
public class A073026 extends A065091 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p1 = p.subtract(1);
      final Z[] q = Jaguar.factor(p1).toZArray();
      if (q[q.length - 1].pow(4).compareTo(p.pow(3)) > 0 && p.divide2().compareTo(q[q.length - 1]) > 0) {
        return p;
      }
    }
  }
}
