package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a007.A007317;

/**
 * A055879 Least nondecreasing sequence with a(1) = 1 and Hankel transform {1,1,1,1,...}.
 * @author Sean A. Irvine
 */
public class A055879 extends A007317 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = super.next();
      return mA;
    }
    final Z t = mA;
    mA = null;
    return t;
  }
}
