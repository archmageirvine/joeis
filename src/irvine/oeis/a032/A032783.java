package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032783 Integer quotients n(n+1)(n+2)...(n+9) / (n+(n+1)+(n+2)+...+(n+9)).
 * @author Sean A. Irvine
 */
public class A032783 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z a = Z.valueOf(++mN)
        .multiply(mN + 1)
        .multiply(mN + 2)
        .multiply(mN + 3)
        .multiply(mN + 4)
        .multiply(mN + 5)
        .multiply(mN + 6)
        .multiply(mN + 7)
        .multiply(mN + 8)
        .multiply(mN + 9);
      final Z[] qr = a.divideAndRemainder(Z.valueOf(10 * mN + 45));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

