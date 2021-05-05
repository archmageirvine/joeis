package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046938 Sequence formed from rows of triangle A046936.
 * @author Sean A. Irvine
 */
public class A046938 extends A046937 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (!t.equals(mA)) {
        return mA;
      }
    }
  }
}
