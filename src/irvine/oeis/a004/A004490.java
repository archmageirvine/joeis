package irvine.oeis.a004;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004490 Colossally abundant numbers: m for which there is a positive exponent epsilon such that sigma(m)/m^{1 + epsilon} &gt;= sigma(k)/k^{1 + epsilon} for all k &gt; 1, so that m attains the maximum value of sigma(m)/m^{1 + epsilon}.
 * @author Sean A. Irvine
 */
public class A004490 implements Sequence {

  // After Keith Briggs, "Abundant Numbers and the Riemann Hypothesis"
  // Note paper appears to contain some errors:
  // In case A, it should be \epsilon_ext = log_p(1+1/p) = log_p(1+p) - 1.
  // The exponents "a" described for case C, also do no seem to match what is required

  private int mIota = 0;
  private final Fast mPrime = new Fast();
  private final ArrayList<Z> mP = new ArrayList<>();
  private final ArrayList<CR> mLogP = new ArrayList<>();
  private final ArrayList<Integer> mExpP = new ArrayList<>();
  private final ArrayList<CR> mEpsilonP = new ArrayList<>();
  private Z mFirstIotaPrime = Z.TWO;
  private Z mNextPrime = Z.TWO;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    // Evaluate epsilon for the three different cases
    // Case A
    final CR epsilonExt = CR.valueOf(mNextPrime.add(1)).log().divide(CR.valueOf(mNextPrime).log()).subtract(CR.ONE);
    // Case B
    final CR q = CR.valueOf(mFirstIotaPrime);
    final Z p1 = mFirstIotaPrime.add(1);
    final CR r = CR.valueOf(p1);
    final CR epsilonIne = CR.valueOf(new Q(Z.ONE, mFirstIotaPrime).add(p1)).divide(r).log().divide(q.log());
    // Case C
    CR epsilonMax = CR.ZERO;
    int bestK = -1;
    for (int k = 0; k < mP.size(); ++k) {
      final CR eps = mEpsilonP.get(k);
      if (eps.compareTo(epsilonMax) > 0) {
        epsilonMax = eps;
        bestK = k;
      }
    }
    //System.out.println("ext=" + epsilonExt);
    //System.out.println("inc=" + epsilonIne);
    //System.out.println("max=" + epsilonMax + " k=" + bestK);

    // Find out which of case A, B, C applies
    if (epsilonExt.compareTo(epsilonIne) > 0 && epsilonExt.compareTo(epsilonMax) > 0) {
      // Case A, add a new prime
      if (mIota == 0) {
        mFirstIotaPrime = mNextPrime;
      }
      ++mIota;
      mN = mN.multiply(mNextPrime);
      mNextPrime = mPrime.nextPrime(mNextPrime);
    } else if (epsilonIne.compareTo(epsilonMax) > 0) {
      // Case B, existing prime in tail is promoted to list with higher exponent
      final Z p = mFirstIotaPrime;
      mFirstIotaPrime = mPrime.nextPrime(mFirstIotaPrime);
      --mIota;
      if (mIota < 0) {
        throw new RuntimeException();
      }
      mP.add(p);
      final CR logP = CR.valueOf(p).log();
      mLogP.add(logP);
      mExpP.add(2);
      final Z pp = p.pow(4);
      mEpsilonP.add(CR.valueOf(Z.ONE.subtract(pp)).divide(CR.valueOf(p.subtract(pp))).log().divide(logP));
      mN = mN.multiply(p);
    } else {
      // Case C, increment exponent of bestK
      final int exp = mExpP.get(bestK) + 1;
      mExpP.set(bestK, exp);
      final Z w = mP.get(bestK);
      final Z pp = w.pow(exp + 2);
      mEpsilonP.set(bestK, CR.valueOf(Z.ONE.subtract(pp)).divide(CR.valueOf(w.subtract(pp))).log().divide(mLogP.get(bestK)));
      mN = mN.multiply(w);
    }
    return mN;
  }
}

