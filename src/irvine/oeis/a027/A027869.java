package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027869 Number of 0's in n!.
 * @author Sean A. Irvine
 */
public class A027869 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  static long count(Z n) {
    long c = 0;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].isZero()) {
        ++c;
      }
      n = qr[0];
    }
    return c;
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return Z.valueOf(count(mF));
  }
}
