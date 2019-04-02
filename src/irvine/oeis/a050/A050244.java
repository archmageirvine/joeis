package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Semiprime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050244 Numbers n such that 2^n + 3^n is a semiprime.
 * @author Sean A. Irvine
 */
public class A050244 implements Sequence {

  private final Factorizer mFactor = new Cheetah(false);
  private final Semiprime mSemiprime = new Semiprime("irvine/oeis/a050/a050244.dat");

  private int mN = 1;
  private boolean mPrintProof = false;
  private boolean mVerbose = false;
  private Z mThreePower = Z.THREE;
  private Z mTwoPower = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mThreePower = mThreePower.multiply(3);
      mTwoPower = mTwoPower.multiply2();
      final Z candidate = mThreePower.add(mTwoPower);
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
    final A050244 seq = new A050244();
    seq.mPrintProof = true;
    int n = 1;
    if (args.length > 0) {
      n = Integer.parseInt(args[0]) - 1;
      seq.mN = Integer.parseInt(args[1]) - 1;
      seq.mTwoPower = Z.ONE.shiftLeft(seq.mN);
      seq.mThreePower = Z.THREE.pow(seq.mN);
    }
    while (true) {
      seq.mSemiprime.setVerbose(true);
      seq.mVerbose = true;
      System.out.println(++n + " " + seq.next());
    }
  }
}

