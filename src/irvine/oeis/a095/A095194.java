package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;
import irvine.oeis.Sequence1;

/**
 * A095194 Least number that yields a semiprime when appended to n!.
 * @author Sean A. Irvine
 */
public class A095194 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    if (mVerbose) {
      System.out.println("[" + mN + "]");
    }
    final String f = mF.toString();
    return new SemiprimeSequence() {
      @Override
      protected Z candidate(final int n) {
        return new Z(f + n);
      }
    }.next();
  }
}
