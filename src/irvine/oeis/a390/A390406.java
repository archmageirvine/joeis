package irvine.oeis.a390;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A390406 Row sums of triangle A390419.
 * @author Sean A. Irvine
 */
public class A390406 extends A390419 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, (mN + 1) / 4 + (mN == 1 ? 1 : 0), k -> t(mN, k));
  }
}
