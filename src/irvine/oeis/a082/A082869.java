package irvine.oeis.a082;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Semiprime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A082869.
 * @author Sean A. Irvine
 */
public class A082869 implements Sequence {

  private final Factorizer mFactor = new Cheetah(false);
  private final Semiprime mSemiprime = new Semiprime("irvine/oeis/a082/a082869.dat");

  private int mN = 1;
  private Z mT = Z.THREE;
  private boolean mPrintProof = false;
  private boolean mVerbose = false;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT.multiply(3);
      final Z candidate = mT.subtract(Z.ONE.shiftLeft(mN));
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
    final A082869 seq = new A082869();
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

