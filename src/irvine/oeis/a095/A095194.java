package irvine.oeis.a095;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Semiprime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A095194.
 * @author Sean A. Irvine
 */
public class A095194 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Factorizer mFactor = new Cheetah(false);
  private final Semiprime mSemiprime = new Semiprime("irvine/oeis/a095/a095194.dat");

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    if (mVerbose) {
      System.out.println("[" + mN + "]");
    }
    final String f = mF.toString();
    long k = 0;
    while (true) {
      final Z candidate = new Z(f + k);
      final FactorSequence fs = new FactorSequence(candidate);
      mFactor.factor(fs);
      final int sp = fs.isSemiprime();
      if (sp == FactorSequence.YES) {
        return Z.valueOf(k);
      }
      if (mVerbose) {
        System.out.println("#" + candidate);
      }
      if (sp == FactorSequence.UNKNOWN && mSemiprime.semiprime(candidate) != null) {
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

