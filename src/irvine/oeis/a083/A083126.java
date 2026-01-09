package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083051.
 * @author Sean A. Irvine
 */
public class A083126 extends A083125 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.multiply(t);
  }
}

