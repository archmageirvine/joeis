package irvine.oeis.a014;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014673 Smallest prime factor of greatest proper divisor of n.
 * @author Sean A. Irvine
 */
public class A014673 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long m = mN / Jaguar.factor(mN).leastPrimeFactor().longValue();
    if (m == 1) {
      return Z.ONE;
    }
    return Jaguar.factor(m).leastPrimeFactor();
  }
}

