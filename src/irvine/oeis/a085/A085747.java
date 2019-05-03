package irvine.oeis.a085;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Semiprime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A085747 Least positive k such that <code>n! +</code> k is a semiprime.
 * @author Sean A. Irvine
 */
public class A085747 implements Sequence {

  private final Factorizer mFactor = new Cheetah(false);
  private final Semiprime mSemiprime = new Semiprime("irvine/oeis/a085/a085747.dat");

  private int mN = 0;
  private Z mF = Z.ONE;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    long k = 1;
    while (k > 0) {
      final Z candidate = mF.add(k);
      if (mVerbose) {
        System.out.println("[" + mN + "!+" + k + "]");
      }
      final FactorSequence fs = new FactorSequence(candidate);
      mFactor.factor(fs);
      final int sp = fs.isSemiprime();
      if (sp == FactorSequence.YES) {
        return Z.valueOf(k);
      }
      if (sp == FactorSequence.UNKNOWN && mSemiprime.semiprime(candidate) != null) {
        return Z.valueOf(k);
      }
      ++k;
    }
    throw new UnsupportedOperationException();
  }
}
