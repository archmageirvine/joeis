package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072180 Numbers k such that 2^k - k^2 is prime.
 * @author Sean A. Irvine
 */
public class A072180 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.shiftLeft(++mN).subtract(mN * mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
