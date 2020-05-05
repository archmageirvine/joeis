package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A031893 Lucky numbers with size of gaps equal to <code>10</code> (upper terms).
 * @author Sean A. Irvine
 */
public class A031893 extends A000959 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (Z.TEN.equals(mA.subtract(t))) {
        return mA;
      }
    }
  }
}
