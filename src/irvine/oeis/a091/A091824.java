package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A091824 Numbers p such that ((p-1)!*2^(p-1) + 1)/p is a prime.
 * @author Sean A. Irvine
 */
public class A091824 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 2) {
        mF = mF.multiply(mN - 1);
      }
      final Z b = mF.shiftLeft(mN - 1).add(1);
      final Z n = Z.valueOf(mN);
      final Z[] qr = b.divideAndRemainder(n);
      if (qr[1].isZero() && qr[0].isProbablePrime()) {
        return n;
      }
    }
  }
}

