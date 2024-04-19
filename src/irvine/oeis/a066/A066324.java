package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066324 Number of endofunctions on n labeled points constructed from k rooted trees.
 * @author Sean A. Irvine
 */
public class A066324 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN).pow(mN - mM)
      .multiply(mM)
      .multiply(Functions.FACTORIAL.z(mN - 1))
      .divide(Functions.FACTORIAL.z(mN - mM));
  }
}
