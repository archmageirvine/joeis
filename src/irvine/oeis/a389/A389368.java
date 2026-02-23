package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.a007.A007310;

/**
 * A389368 a(n) = R(A007310(n)), where R(k) = (5*k+1)/(2^r*3^s), with r and s as large as possible, that is R(k) = A065330(A016861(k)).
 * @author Sean A. Irvine
 */
public class A389368 extends A007310 {

  @Override
  public Z next() {
    Z t = super.next().multiply(5).add(1).makeOdd();
    while (true) {
      final Z[] qr = t.divideAndRemainder(Z.THREE);
      if (!qr[1].isZero()) {
        return t;
      }
      t = qr[0];
    }
  }
}

