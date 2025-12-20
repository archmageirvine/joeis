package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082680 Triangle read by rows: T(n,k) is the number of 2-stack sortable n-permutations with k runs.
 * @author Sean A. Irvine
 */
public class A082680 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.FACTORIAL.z(mN + mM - 1)
      .multiply(Functions.FACTORIAL.z(2L * mN - mM))
      .divide(Functions.FACTORIAL.z(mM))
      .divide(Functions.FACTORIAL.z(mN + 1 - mM))
      .divide(Functions.FACTORIAL.z(2 * mM - 1))
      .divide(Functions.FACTORIAL.z(2L * mN - 2L * mM + 1));
  }
}
