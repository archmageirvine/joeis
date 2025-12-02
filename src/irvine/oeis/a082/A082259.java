package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082259 Triangle read by rows in which the n-th row contains n multiples of n with digit sum n.
 * @author Sean A. Irvine
 */
public class A082259 extends Sequence1 {

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
    while (true) {
      mR += mN;
      if (Functions.DIGIT_SUM.l(mR) == mN) {
        return Z.valueOf(mR);
      }
    }
  }
}
