package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080742.
 * @author Sean A. Irvine
 */
public class A080742 extends A080738 {

  private Z mA = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.compareTo(t) < 0) {
        return t;
      }
    }
  }
}
