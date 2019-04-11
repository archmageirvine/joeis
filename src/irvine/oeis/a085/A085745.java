package irvine.oeis.a085;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Semiprime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A085745 <code>2^n + n</code> is a semiprime.
 * @author Sean A. Irvine
 */
public class A085745 implements Sequence {

  private final Factorizer mFactor = new Cheetah(false);
  private final Semiprime mSemiprime = new Semiprime("irvine/oeis/a085/a085745.dat");

  private int mN = 1;
  private boolean mPrintProof = false;
  private boolean mVerbose = false;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z candidate = Z.ONE.shiftLeft(mN).add(mN);
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
    final A085745 seq = new A085745();
    seq.mPrintProof = true;
    long n = 1;
    if (args.length > 0) {
      seq.mN = Integer.parseInt(args[1]) - 1;
      n = Integer.parseInt(args[0]) - 1;
    }
    while (true) {
      seq.mSemiprime.setVerbose(true);
      seq.mVerbose = true;
      System.out.println(++n + " " + seq.next());
    }
  }
}

