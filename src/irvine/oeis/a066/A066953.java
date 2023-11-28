package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066953 Integers of the form (n!+1)/prime(n).
 * @author Sean A. Irvine
 */
public class A066953 extends A000040 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      mF = mF.multiply(++mN);
      final Z[] qr = mF.add(1).divideAndRemainder(p);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
