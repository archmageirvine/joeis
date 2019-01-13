package irvine.oeis.a153;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Semiprime;
import irvine.math.z.Z;
import irvine.oeis.a001.A001008;

/**
 * A153357.
 * @author Sean A. Irvine
 */
public class A153357 extends A001008 {

  private final Factorizer mFactor = new Cheetah(false);
  private final Semiprime mSemiprime = new Semiprime("irvine/oeis/a153/a153357.dat");
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      final Z candidate = super.next();
      if (mVerbose) {
        System.out.println("[" + mN + "]: " + candidate);
      }
      final FactorSequence fs = new FactorSequence(candidate);
      mFactor.factor(fs);
      final int sp = fs.isSemiprime();
      if (sp == FactorSequence.YES) {
        return Z.valueOf(mN);
      }
      if (sp == FactorSequence.UNKNOWN && mSemiprime.semiprime(candidate) != null) {
        return Z.valueOf(mN);
      }
    }
  }
}
