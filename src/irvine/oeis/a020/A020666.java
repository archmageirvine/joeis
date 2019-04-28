package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020666.
 * @author Sean A. Irvine
 */
public class A020666 implements Sequence {

  private int mN = 0;

  static int syndrome(Z n) {
    int syndrome = 0;
    while (!Z.ZERO.equals(n)) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      syndrome |= 1 << qr[1].intValue();
      n = qr[0];
    }
    return syndrome;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.valueOf(1023456789);
    }
    Z m = Z.TWO;
    while (syndrome(m.pow(mN)) != 0b1111111111) {
      m = m.add(1);
    }
    return m;
  }
}
