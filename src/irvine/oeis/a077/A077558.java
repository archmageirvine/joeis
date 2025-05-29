package irvine.oeis.a077;

import java.util.Arrays;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077558 Triangle in which the n-th row contains n numbers beginning with n that have the same prime signature as n.
 * @author Sean A. Irvine
 */
public class A077558 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mR = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mR = mN - 1;
    }
    final int[] sig = FactorUtils.sortedPrimeSignature(Z.valueOf(mN));
    while (true) {
      if (Arrays.equals(sig, FactorUtils.sortedPrimeSignature(Z.valueOf(++mR)))) {
        return Z.valueOf(mR);
      }
    }
  }
}
