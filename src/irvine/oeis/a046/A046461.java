package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.factor.Jaguar;
import irvine.factor.project.smarandache.Smarandache;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Semiprime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046461.
 * @author Sean A. Irvine
 */
public class A046461 implements Sequence {

  private final Factorizer mFactor = new Cheetah(false);
  private final Semiprime mSemiprime = new Semiprime("irvine/oeis/a046/a046461.dat");

  private int mN = 2;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      final Z candidate = Smarandache.smarandacheZ(++mN);
      if (mVerbose) {
        System.err.println("[Sm(" + mN + ")]");
      }
      final FactorSequence fs = Jaguar.factor(candidate);
      if (fs.isSemiprime() != FactorSequence.NO) {
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

  /**
   * Run from a particular start value.
   *
   * @param args start position
   */
  public static void main(final String[] args) {
    final A046461 seq = new A046461();
    seq.mN = Integer.parseInt(args[0]) - 1;
    while (true) {
      System.out.println(seq.next());
    }
  }
}
