package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084443 Primes that can be written in more than one way as 1+p+p^k, p prime and k&gt;0.
 * @author Sean A. Irvine
 */
public class A084443 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p1 = p.subtract(1);
      int cnt = 0;
      for (final Z q : Jaguar.factor(p1).toZArray()) {
        final Z pq1 = p1.subtract(q);
        if (pq1.equals(q.pow(Functions.VALUATION.l(pq1, q))) && ++cnt > 1) {
          return p;
        }
      }
    }
  }
}
