package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000312;

/**
 * A066908 n^n minus largest factorial less than or equal to n^n.
 * @author Sean A. Irvine
 */
public class A066908 extends A000312 {

  private Z mF = Z.ONE;
  private long mN = 2;

  @Override
  public Z next() {
    final Z t = super.next();
    while (true) {
      final Z f = mF.multiply(mN);
      if (t.subtract(f).signum() >= 0) {
        mF = f;
        ++mN;
      } else {
        return t.subtract(mF);
      }
    }
  }
}
