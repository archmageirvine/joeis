package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077661 Triangle read by rows in which the n-th row contains n smallest numbers not coprime to n; except first row = {1}.
 * @author Sean A. Irvine
 */
public class A077661 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mK = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mM = 0;
      mK = 1;
    }
    while (true) {
      if (Functions.GCD.l(++mK, mN) != 1) {
        return Z.valueOf(mK);
      }
    }
  }
}
