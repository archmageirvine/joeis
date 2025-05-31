package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077583 Triangle read by rows in which the n-th row contains n numbers starting with n and not coprime to n, except the first row is {1}.
 * @author Sean A. Irvine
 */
public class A077583 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mK = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mK = mN - 1;
    }
    while (true) {
      if (++mK == mN || Functions.GCD.l(mK, mN) != 1) {
        return Z.valueOf(mK);
      }
    }
  }
}
