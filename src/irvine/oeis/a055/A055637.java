package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A055637 (n-1)!/n or 0 if n does not divide (n-1)!..
 * @author Sean A. Irvine
 */
public class A055637 extends A000142 {

  @Override
  public Z next() {
    final Z f = super.next();
    final Z[] qr = f.divideAndRemainder(Z.valueOf(mN + 1));
    return qr[1].isZero() ? qr[0] : Z.ZERO;
  }
}

