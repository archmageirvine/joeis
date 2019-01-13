package irvine.oeis.a101;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Semiprime;
import irvine.math.z.Z;
import irvine.oeis.a000.A000073;

/**
 * A101757.
 * @author Sean A. Irvine
 */
public class A101757 extends A000073 {

  private final Factorizer mFactor = new Cheetah(false);
  private final Semiprime mSemiprime = new Semiprime("irvine/oeis/a101/a101757.dat");

  private int mN = 4;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  {
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z candidate = super.next();
      if (mVerbose) {
        System.err.println("[t(" + mN + ")=" + candidate + "]");
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
