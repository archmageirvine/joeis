package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003121 Strict sense ballot numbers: n candidates, k-th candidate gets k votes.
 * @author Sean A. Irvine
 */
public class A003121 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z p = Functions.FACTORIAL.z((mN * mN + mN) / 2);
    for (int k = 1; k <= mN; ++k) {
      p = p.multiply(Functions.FACTORIAL.z(k - 1)).divide(Functions.FACTORIAL.z(2 * k - 1));
    }
    return p;
  }
}
