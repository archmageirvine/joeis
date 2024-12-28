package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073915 Triangle read by rows in which the n-th row contains the first n numbers with n divisors.
 * @author Sean A. Irvine
 */
public class A073915 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mK = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mK = 0;
    }
    while (true) {
      if (Functions.SIGMA0.l(++mK) == mN) {
        return Z.valueOf(mK);
      }
    }
  }
}

