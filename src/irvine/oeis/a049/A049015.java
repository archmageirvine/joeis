package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A049015 Numbers k such that the sum of the first k Mersenne prime exponents is prime.
 * @author Sean A. Irvine
 */
public class A049015 extends A000043 {

  private long mN = 0;
  private Z mSumExponents = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSumExponents = mSumExponents.add(super.next());
      if (mSumExponents.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
