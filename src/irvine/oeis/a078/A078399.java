package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078296.
 * @author Sean A. Irvine
 */
public class A078399 extends A078398 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}

