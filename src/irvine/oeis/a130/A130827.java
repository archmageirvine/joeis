package irvine.oeis.a130;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Semiprime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A130827 Least k <code>&gt;= 1</code> such that k^n+n is semiprime, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A130827 implements Sequence {

  private final Factorizer mFactor = new Cheetah(false);
  private final Semiprime mSemiprime = new Semiprime("irvine/oeis/a130/a130827.dat");

  private int mN = 0;
  private boolean mPrintProof = false;
  private boolean mVerbose = false;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final Z candidate = Z.valueOf(++k).pow(mN).add(mN);
      if (mVerbose) {
        System.out.print("[" + k + "]");
        System.out.flush();
      }
      final FactorSequence fs = new FactorSequence(candidate);
      mFactor.factor(fs);
      final int sp = fs.isSemiprime();
      if (sp == FactorSequence.YES) {
        if (mPrintProof) {
          System.out.println(fs);
        }
        return Z.valueOf(k);
      }
      final FactorSequence fp;
      if (sp == FactorSequence.UNKNOWN && (fp = mSemiprime.semiprime(candidate)) != null) {
        if (mPrintProof) {
          System.out.println(fp);
        }
        return Z.valueOf(k);
      }
    }
  }

  /**
   * Generate with proofs.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
    final A130827 seq = new A130827();
    seq.mPrintProof = true;
    seq.mVerbose = true;
    if (args.length > 0) {
      seq.mN = Integer.parseInt(args[0]) - 1;
    }
    long n = seq.mN;
    while (true) {
      System.out.println(++n + " " + seq.next());
    }
  }
}

