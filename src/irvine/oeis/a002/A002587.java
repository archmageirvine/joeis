package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002587 Largest prime factor of 2^n + 1.
 * @author Sean A. Irvine
 */
public class A002587 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(++mN).add(1);
    if (mVerbose) {
      System.out.println("Doing: 2^" + mN + "+1=" + t);
    }
    return Jaguar.factor(t).largestPrimeFactor();
  }
}
