package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002588 a(n) = largest noncomposite factor of 2^(2n+1) - 1.
 * @author Sean A. Irvine
 */
public class A002588 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final Z t = Z.ONE.shiftLeft(mN).subtract(1);
    if (mVerbose) {
      System.out.println("Doing: 2^" + mN + "-1=" + t);
    }
    return Functions.GPF.z(t);
  }
}
