package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002234 Numbers n such that the Woodall number n*2^n - 1 is prime.
 * @author Sean A. Irvine
 */
public class A002234 implements Sequence {

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
