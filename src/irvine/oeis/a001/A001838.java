package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A001838.
 * @author Sean A. Irvine
 */
public class A001838 extends A000010 {

  private long mN = 0;
  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      final boolean nailed = t.equals(mA.add(Z.TWO));
      mA = mB;
      mB = t;
      if (nailed) {
        return Z.valueOf(mN);
      }
    }
  }
}
