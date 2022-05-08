package irvine.oeis.a266;

import irvine.math.z.Z;
import irvine.oeis.a258.A258829;

/**
 * A266947 Number of permutations p of [2n] such that the up-down signature of 0,p has nonnegative partial sums with a maximal value of n.
 * @author Georg Fischer
 */
public class A266947 extends A258829 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.compute(2 * mN, mN);
  }
}

