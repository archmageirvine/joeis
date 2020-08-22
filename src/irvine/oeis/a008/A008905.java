package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008905 Leading digit of n!.
 * @author Sean A. Irvine
 */
public class A008905 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      Z[] qr;
      while (Z.ZERO.equals((qr = mF.divideAndRemainder(Z.TEN))[1])) {
        mF = qr[0];
      }
    }
    return Z.valueOf(mF.toString().charAt(0) - '0');
  }
}
