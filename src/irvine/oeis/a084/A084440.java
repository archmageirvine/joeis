package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084440 Number of ways to write the n-th prime as 1+p+p^k, p prime and k &gt; 0.
 * @author Sean A. Irvine
 */
public class A084440 extends A000040 {

  // After Amiram Eldar

  @Override
  public Z next() {
    final Z p = super.next();
    final Z p1 = p.subtract(1);
    long cnt = 0;
    for (final Z q : Jaguar.factor(p1).toZArray()) {
      final Z pq1 = p1.subtract(q);
      if (pq1.equals(q.pow(Functions.VALUATION.l(pq1, q)))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
