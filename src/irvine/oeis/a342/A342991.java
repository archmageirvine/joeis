package irvine.oeis.a342;

import irvine.math.z.Z;
import irvine.oeis.a003.A003417;

/**
 * A342991 Left(0)/right(1) turning sequence needed to traverse the Stern-Brocot tree (A007305, A047679) from the root down to e (A001113).
 * @author Sean A. Irvine
 */
public class A342991 extends A003417 {

  private long mC = super.next().longValueExact();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (--mC < 0) {
      mA = Z.ONE.subtract(mA);
      mC = super.next().longValueExact() - 1;
    }
    return mA;
  }
}
