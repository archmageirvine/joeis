package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a389.A389804;

/**
 * A390083 allocated for Hu Junhua.
 * @author Sean A. Irvine
 */
public class A390083 extends A389804 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t).subtract(1).divide2();
  }
}
