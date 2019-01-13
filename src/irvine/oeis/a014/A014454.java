package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014454.
 * @author Sean A. Irvine
 */
public class A014454 implements Sequence {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z sum = Z.ZERO;
    Z kf = Z.ONE;
    Z nf = mF;
    for (long k = 1; k < mN; ++k) {
      kf = kf.multiply(k);
      nf = nf.divide(k);
      sum = sum.add(kf.gcd(nf));
    }
    return sum;
  }
}
