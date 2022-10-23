package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008338 a(n+1) = a(n)/n! if n! divides a(n) else a(n)*n!.
 * @author Sean A. Irvine
 */
public class A008338 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
      final Z[] qr = mA.divideAndRemainder(mF);
      if (qr[1].isZero()) {
        mA = mA.divide(mF);
      } else {
        mA = mA.multiply(mF);
      }
    }
    return mA;
  }
}


