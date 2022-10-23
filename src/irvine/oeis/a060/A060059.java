package irvine.oeis.a060;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A060059 Row sums of triangle A060058.
 * @author Sean A. Irvine
 */
public class A060059 extends A060058 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> mA.get(mN, k));
  }
}
