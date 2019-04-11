package irvine.oeis.a081;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Semiprime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081715 Numbers n such that <code>3^n+2</code> is a semiprime.
 * @author Sean A. Irvine
 */
public class A081715 implements Sequence {

  private final Factorizer mFactor = new Cheetah(false);
  private final Semiprime mSemiprime = new Semiprime("irvine/oeis/a081/a081715.dat");

  private int mN = 5;
  private Z mZ = Z.THREE.pow(mN);
  private boolean mPrintProof = false;
  private boolean mVerbose = false;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mZ = mZ.multiply(3);
      final Z candidate = mZ.add(2);
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
    final A081715 seq = new A081715();
    seq.mPrintProof = true;
    int n = 5;
    if (args.length > 0) {
      n = Integer.parseInt(args[0]) - 1;
      seq.mN = n;
      seq.mZ = Z.THREE.pow(n);
    }
    while (true) {
      if (n >= 39) {
        seq.mSemiprime.setVerbose(true);
        seq.mVerbose = true;
      }
      System.out.println(++n + " " + seq.next());
    }
  }
}

