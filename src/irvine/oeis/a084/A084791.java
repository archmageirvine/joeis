package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A084791 Where record gaps between 3-smooth numbers occur.
 * @author Sean A. Irvine
 */
public class A084791 extends A003586 {

  private Z mGap = Z.ZERO;
  private Z mA = super.next();
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      ++mM;
      final Z t = mA;
      mA = super.next();
      final Z d = mA.subtract(t);
      if (d.compareTo(mGap) > 0) {
        mGap = d;
        return Z.valueOf(mM);
      }
    }
  }
}
