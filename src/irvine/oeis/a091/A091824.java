package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A091824.
 * @author Sean A. Irvine
 */
public class A091824 implements Sequence {

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
      if (Z.ZERO.equals(qr[1]) && qr[0].isProbablePrime()) {
        return n;
      }
    }
  }
}

