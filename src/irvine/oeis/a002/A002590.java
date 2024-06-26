package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002590 Largest prime factor of 16^n + 1.
 * @author Sean A. Irvine
 */
public class A002590 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -4;

  @Override
  public Z next() {
    mN += 4;
    final Z t = Z.ONE.shiftLeft(mN).add(1);
    if (mVerbose) {
      System.out.println("Doing: 2^" + mN + "+1=" + t);
    }
    return Functions.GPF.z(t);
  }
}
