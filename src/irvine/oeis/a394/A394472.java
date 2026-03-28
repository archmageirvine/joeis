package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A394472 a(n) = Product_{k=1..n} (2*prime(n)-prime(k)).
 * @author Sean A. Irvine
 */
public class A394472 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z p2 = p.multiply2();
    Z prod = Z.ONE;
    for (Z q = Z.TWO; q.compareTo(p) <= 0; q = mPrime.nextPrime(q)) {
      prod = prod.multiply(p2.subtract(q));
    }
    return prod;
  }
}
