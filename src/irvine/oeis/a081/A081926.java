package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081926 Triangle read by rows in which n-th row gives n smallest numbers with digit sum n.
 * @author Sean A. Irvine
 */
public class A081926 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mR = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mR = 0;
    }
    while (Functions.DIGIT_SUM.l(++mR) != mN) {
      // do nothing
    }
    return Z.valueOf(mR);
  }
}
