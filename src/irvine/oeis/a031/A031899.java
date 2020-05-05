package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A031899 Lucky numbers with size of gaps equal to <code>16</code> (upper terms).
 * @author Sean A. Irvine
 */
public class A031899 extends A000959 {

  private static final Z N = Z.valueOf(16);
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (N.equals(mA.subtract(t))) {
        return mA;
      }
    }
  }
}
