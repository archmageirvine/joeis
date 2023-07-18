package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064552.
 * @author Sean A. Irvine
 */
public class A064557 extends A064553 {

  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (super.next().isProbablePrime()) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}

