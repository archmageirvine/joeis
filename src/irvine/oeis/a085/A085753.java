package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;
import irvine.oeis.Sequence1;

/**
 * A085753 Least k such that n^n + k is a semiprime.
 * @author Sean A. Irvine
 */
public class A085753 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  @Override
  public Z next() {
    final Z nn = Z.valueOf(++mN).pow(mN);
    if (mVerbose) {
      System.out.println("[" + mN + "]");
    }
    return new SemiprimeSequence() {
      @Override
      protected Z candidate(final int n) {
        return nn.add(n);
      }
    }.next();
  }
}
