package irvine.oeis.a109;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Semiprime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A109758 Numbers n such that <code>(10</code>'s complement factorial of <code>n) - 1</code> is semiprime.
 * @author Sean A. Irvine
 */
public class A109758 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Factorizer mFactor = new Cheetah(false);
  private final Semiprime mSemiprime = new Semiprime("irvine/oeis/a109/a109758.dat");

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z candidate = A109757.tensComplementFactorial(++mN).subtract(1);
      if (mVerbose) {
        System.out.println("[" + mN + "]: " + candidate);
        System.out.flush();
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

