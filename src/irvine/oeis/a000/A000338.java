package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000338 Expansion of (5-2x)(1-x^3)/(1-x)^4.
 * @author Sean A. Irvine
 */
public class A000338 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.TWO;
      return Z.FIVE;
    }
    mN = mN.add(1);
    return mN.square().multiply(9).subtract(mN.multiply(15)).divide2();
  }
}

