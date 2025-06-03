package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077611 Number of adjacent pairs of form (odd,odd) among all permutations of {1,2,...,n}.
 * @author Sean A. Irvine
 */
public class A077611 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(mN++).multiply((mN + 1) / 2).multiply((mN - 1) / 2);
  }
}
