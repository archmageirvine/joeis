package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032773 Integer quotients n(n+1)(n+2)...(n+5) / (n+(n+1)+(n+2)+...+(n+5)).
 * @author Sean A. Irvine
 */
public class A032773 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z a = Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2).multiply(mN + 3).multiply(mN + 4).multiply(mN + 5);
      final Z[] qr = a.divideAndRemainder(Z.valueOf(6 * mN + 15));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

