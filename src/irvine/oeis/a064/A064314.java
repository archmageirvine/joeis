package irvine.oeis.a064;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a008.A008304;

/**
 * A064314 Total length of longest increasing runs in all permutations of n elements.
 * @author Sean A. Irvine
 */
public class A064314 extends A008304 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> t(mN, k).multiply(k));
  }
}
