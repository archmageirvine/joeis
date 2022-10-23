package irvine.oeis.a130;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;
import irvine.oeis.Sequence1;

/**
 * A130827 Least k &gt;= 1 such that k^n+n is semiprime, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A130827 extends Sequence1 {

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
        return Z.valueOf(n).pow(mN).add(mN);
      }
    }.next();
  }
}
