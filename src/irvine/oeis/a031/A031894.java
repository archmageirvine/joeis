package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A031894 Lucky numbers with size of gaps equal to <code>12</code> (lower terms).
 * @author Sean A. Irvine
 */
public class A031894 extends A000959 {

  private static final Z N = Z.valueOf(12);
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (N.equals(mA.subtract(t))) {
        return t;
      }
    }
  }
}
