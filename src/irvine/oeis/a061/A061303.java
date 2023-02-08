package irvine.oeis.a061;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061303 Given a prime p, let s(p,0)=p and let s(p,n+1) be the smallest prime == 1 (mod s(p,n)). Let S(p) be the sequence {s(p,n): n=0,1,...}. Let a(0)=2 and let a(n+1) be the smallest prime not in any of the sequences S(a(0)), ..., S(a(n)).
 * @author Sean A. Irvine
 */
public class A061303 extends Sequence0 {

  private long mN = 1;
  private Z mF = Z.ONE;
  private final PrimeDivision mFactor = new PrimeDivision();
  private final FactorSequence mFactorSequence = new FactorSequence();

  @Override
  public Z next() {
    while (true) {
      final Z prev = mF.gcd(mFactorSequence.phi());
      mF = mF.multiply(++mN);
      mFactorSequence.merge(mFactor.factorize(Z.valueOf(mN)));
      final Z current = mF.gcd(mFactorSequence.phi());
      if (current.equals(prev)) {
        return Z.valueOf(mN);
      }
    }
  }
}
