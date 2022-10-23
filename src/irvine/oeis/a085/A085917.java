package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;
import irvine.oeis.Sequence1;

/**
 * A085917 Least k such that k*2^n - 1 is a semiprime.
 * @author Sean A. Irvine
 */
public class A085917 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mVerbose) {
      System.out.println("[" + mN + "]");
    }
    return new SemiprimeSequence(1) {
      @Override
      protected Z candidate(final int n) {
        return Z.valueOf(n).shiftLeft(mN).subtract(1);
      }
    }.next();
  }
}
