package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000693 Related to population of numbers of form <code>x^2 + y^2</code>.
 * @author Sean A. Irvine
 */
public class A000693 extends A000074 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      super.next();
      super.next();
      mA = Z.ONE;
      return Z.ONE;
    }
    if (mB == null) {
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z t = super.next().add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}



