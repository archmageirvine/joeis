package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a001.A001694;

/**
 * A060355 Numbers k such that k and k+1 are powerful numbers.
 * @author Sean A. Irvine
 */
public class A060355 extends A001694 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (Z.ONE.equals(mA.subtract(t))) {
        return t;
      }
    }
  }
}
