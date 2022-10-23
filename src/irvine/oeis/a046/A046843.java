package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046843 Numbers k such that k*2^k - k - 1 is prime.
 * @author Sean A. Irvine
 */
public class A046843 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).shiftLeft(mN).subtract(mN + 1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
