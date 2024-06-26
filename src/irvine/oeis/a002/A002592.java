package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002592 Largest prime factor of 9^n + 1.
 * @author Sean A. Irvine
 */
public class A002592 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -2;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z t = mA.add(1);
    if (mVerbose) {
      mN += 2;
      System.out.println("Doing: 3^" + mN + "+1=" + t);
    }
    mA = mA.multiply(9);
    return Functions.GPF.z(t);
  }
}
