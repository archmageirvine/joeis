package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077664 Triangle in which the n-th row contains n smallest numbers greater than n and coprime to n.
 * @author Sean A. Irvine
 */
public class A077664 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mK = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mK = mN;
    }
    while (true) {
      if (++mK == mN || Functions.GCD.l(mK, mN) == 1) {
        return Z.valueOf(mK);
      }
    }
  }
}
