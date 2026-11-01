package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A087139 Least k&gt;1 such that p^k - p^(k-1) + 1 is prime for p = prime(n).
 * @author Sean A. Irvine
 */
public class A087139 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z q = p;
    long k = 1;
    while (true) {
      ++k;
      final Z r = q;
      q = q.multiply(p);
      if (q.subtract(r).add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
