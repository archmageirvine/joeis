package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048744 Numbers k such that 2^k - k is prime.
 * @author Sean A. Irvine
 */
public class A048744 extends Sequence1 {

  private int mN = 0;
  private int mAdd = 2;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.TWO;
    }
    // all other terms {1,3} (mod 6)
    while (true) {
      mN += 2;
      mAdd = 5 - mAdd; // 3, 2, 3, 2, ...
      if (Z.ONE.shiftLeft(mN).subtract(mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
