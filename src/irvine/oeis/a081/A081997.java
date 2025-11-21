package irvine.oeis.a081;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A081997 Row sums in triangle A081994.
 * @author Sean A. Irvine
 */
public class A081997 extends A081994 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> Z.valueOf(mB.get(mN, k)));
  }
}
