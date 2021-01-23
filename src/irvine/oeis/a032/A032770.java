package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032770 Integer quotients of n(n + 1)(n + 2)(n + 3)(n + 4) / (n+(n+1)+(n+2)+(n+3)+(n+4)).
 * @author Sean A. Irvine
 */
public class A032770 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z a = Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2).multiply(mN + 3).multiply(mN + 4);
      final Z[] qr = a.divideAndRemainder(Z.valueOf(5 * mN + 10));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

