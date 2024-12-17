package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073691 Primes p = product(A073692(n), A073692(n)+2,..., A073692(n+1)-2) plus 2.
 * @author Sean A. Irvine
 */
public class A073691 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 1;
      return Z.ONE;
    }
    Z prod = Z.valueOf(mN);
    mN += 2;
    while (!prod.add(2).isProbablePrime()) {
      prod = prod.multiply(mN);
      mN += 2;
    }
    return prod.add(2);
  }
}
