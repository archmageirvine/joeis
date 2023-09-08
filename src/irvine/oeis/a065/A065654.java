package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065640.
 * @author Sean A. Irvine
 */
public class A065654 extends A065653 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.add(mA).subtract(1).divide2();
  }
}
