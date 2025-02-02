package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a075.A075407;

/**
 * A074851.
 * @author Sean A. Irvine
 */
public class A074888 extends A075407 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.add(1).equals(mA)) {
        return t;
      }
    }
  }
}
