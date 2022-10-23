package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002234 Numbers k such that the Woodall number k*2^k - 1 is prime.
 * @author Sean A. Irvine
 */
public class A002234 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (n.shiftLeft(mN).subtract(1).isProbablePrime()) {
        return n;
      }
    }
  }
}
