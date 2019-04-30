package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000921 Primes p of the form <code>3k+1</code> such that <code>Sum_{x=1</code>..p} cos(2*Pi*x^3/p) <code>&gt; </code> sqrt(p).
 * @author Sean A. Irvine
 */
public class A000921 implements Sequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private long mP = 5;
  private final Fast mPrime = new Fast();

  protected boolean compare(final CR s, final CR p) {
    return s.signum() >= 0 && s.multiply(s).compareTo(p) > 0;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % 3 == 1) {
        final CR pf = CR.valueOf(mP);
        CR s = CR.ZERO;
        for (long k = 1; k <= mP; ++k) {
          final CR kf = CR.valueOf(k);
          s = s.add(REALS.cos(kf.multiply(kf).multiply(kf).multiply(CR.TAU).divide(pf)));
        }
        if (compare(s, pf)) {
          return Z.valueOf(mP);
        }
      }
    }
  }
}
