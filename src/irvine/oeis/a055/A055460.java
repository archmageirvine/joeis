package irvine.oeis.a055;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055460 Number of primes with odd exponents in the prime power factorization of n!.
 * @author Sean A. Irvine
 */
public class A055460 implements Sequence {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(++mN)));
    long cnt = 0;
    for (final Z p : mFactorSequence.toZArray()) {
      if ((mFactorSequence.getExponent(p) & 1) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

