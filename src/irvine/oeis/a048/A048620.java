package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048620 a(n) is the maximal value of Omega(binomial(n,k)) over k, where Omega = A001222.
 * @author Sean A. Irvine
 */
public class A048620 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long max = 0;
    for (long k = 0; k <= mN / 2; ++k) {
      final long omega = mFactor.factorize(Binomial.binomial(mN, k)).bigOmega();
      if (omega > max) {
        max = omega;
      }
    }
    return Z.valueOf(max);
  }
}

