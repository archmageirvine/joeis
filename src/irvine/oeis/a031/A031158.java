package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A031158 Twin lucky numbers (lower terms).
 * @author Sean A. Irvine
 */
public class A031158 extends A000959 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(2).equals(t)) {
        return t;
      }
    }
  }
}
