package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A057035 Numbers n such that n = p + q with n*p*q = primorial number (A002110) (p &lt;= q, p &gt; 0, q &gt; 0).
 * @author Sean A. Irvine
 */
public class A057035 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private final FactorSequence mFS = new FactorSequence();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = Z.ONE;
  private Z mPrimorial = Z.ONE;

  private void step() {
    mP = mPrime.nextPrime(mP);
    mPrimorial = mPrimorial.multiply(mP);
    mFS.add(mP, FactorSequence.PRIME);
    final Z[] d = mFS.divisorsSorted();
    for (final Z q : d) {
      final Z nq = mPrimorial.divide(q);
      for (final Z p : d) {
        final Z[] nqp = nq.divideAndRemainder(p);
        if (nqp[1].isZero()) {
          final Z n = nqp[0];
          if (n.equals(q.add(p))) {
            mA.add(n);
          }
        }
        if (p.equals(q)) {
          break;
        }
      }
    }
    if (mVerbose) {
      StringUtils.message("Completed search for p=" + mP + ": queue = " + mA);
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      step(); // do this twice to help with ordering (heuristic)
      step();
    }
    return mA.pollFirst();
  }
}
