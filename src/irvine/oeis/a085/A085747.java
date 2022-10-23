package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;
import irvine.oeis.Sequence1;

/**
 * A085747 Least positive k such that n! + k is a semiprime.
 * @author Sean A. Irvine
 */
public class A085747 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    if (mVerbose) {
      System.out.println("[" + mN + "]");
    }
    return new SemiprimeSequence(1) {
      @Override
      protected Z candidate(final int n) {
        return mF.add(n);
      }
    }.next();
  }
}
