package irvine.oeis.a389;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A389573 allocated for Mats Granvik.
 * @author Sean A. Irvine
 */
public class A389573 extends A389524 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, (++mN + 1) / 2, k -> mB.get(mN, mN - 2 * k + 2));
  }
}

