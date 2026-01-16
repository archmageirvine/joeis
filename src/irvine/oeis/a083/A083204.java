package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083203.
 * @author Sean A. Irvine
 */
public class A083204 extends A083203 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.multiply(t).add(1).root(3);
  }
}
