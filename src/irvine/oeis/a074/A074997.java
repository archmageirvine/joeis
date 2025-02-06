package irvine.oeis.a074;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053188.
 * @author Sean A. Irvine
 */
public class A074997 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (FactorUtils.leastPrimeSignature(Z.valueOf(mN++)).equals(FactorUtils.leastPrimeSignature(Z.valueOf(mN + 1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

