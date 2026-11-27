package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087564 a(n) = smallest prime of the form n*(n+1)*(n+2)*...*(n+k) + 1, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A087564 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.valueOf(++mN);
    long k = mN;
    while (!prod.add(1).isProbablePrime()) {
      prod = prod.multiply(++k);
    }
    return prod.add(1);
  }
}
