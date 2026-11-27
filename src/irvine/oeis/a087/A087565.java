package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087565 a(n) = smallest k such that n*(n+1)*(n+2)...(n+k) + 1 is prime, or -1 if no prime of such form exists.
 * @author Sean A. Irvine
 */
public class A087565 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.valueOf(++mN);
    long k = mN;
    while (!prod.add(1).isProbablePrime()) {
      prod = prod.multiply(++k);
    }
    return Z.valueOf(k - mN);
  }
}
