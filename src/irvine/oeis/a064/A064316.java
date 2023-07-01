package irvine.oeis.a064;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A064316 Total length of shortest ascending runs of permutations of length n.
 * @author Sean A. Irvine
 */
public class A064316 extends A064315 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> t(mN, k).multiply(k));
  }
}
