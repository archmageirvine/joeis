package irvine.oeis.a080;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Semiprime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A080892 Numbers n such that <code>3^n-2</code> is a semiprime.
 * @author Sean A. Irvine
 */
public class A080892 implements Sequence {

  private final Factorizer mFactor = new Cheetah(false);
  private final Semiprime mSemiprime = new Semiprime("irvine/oeis/a080/a080892.dat");

  private int mN = 2;
  private boolean mPrintProof = false;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z candidate = Z.THREE.pow(mN).subtract(2);
      if (mVerbose) {
        System.out.println("[" + mN + "]");
      }
      final FactorSequence fs = new FactorSequence(candidate);
      mFactor.factor(fs);
      final int sp = fs.isSemiprime();
      if (sp == FactorSequence.YES) {
        if (mPrintProof) {
          System.out.println(fs);
        }
        return Z.valueOf(mN);
      }
      final FactorSequence fp;
      if (sp == FactorSequence.UNKNOWN && (fp = mSemiprime.semiprime(candidate)) != null) {
        if (mPrintProof) {
          System.out.println(fp);
        }
        return Z.valueOf(mN);
      }
    }
  }

  /**
   * Generate with proofs.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
    final A080892 seq = new A080892();
    seq.mPrintProof = true;
    if (args.length > 0) {
      seq.mN = Integer.parseInt(args[0]) - 1;
    }
    long n = seq.mN;
    while (true) {
      System.out.println(++n + " " + seq.next());
    }
  }
}

