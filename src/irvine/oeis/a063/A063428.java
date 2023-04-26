package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A063428 a(n) is the smallest positive integer of the form n*k/(n+k).
 * @author Sean A. Irvine
 */
public class A063428 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 1;
    while (true) {
      final Z[] qr = mN.multiply(++k).divideAndRemainder(mN.add(k));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
