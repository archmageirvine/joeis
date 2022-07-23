package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058067 Number of polynomial functions from Z to Z/nZ.
 * @author Sean A. Irvine
 */
public class A058067 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    Z kf = Z.ONE;
    for (long k = 0; k < mN; kf = kf.multiply(++k)) {
      prod = prod.multiply(mN / kf.gcd(Z.valueOf(mN)).longValue());
    }
    return prod;
  }
}

