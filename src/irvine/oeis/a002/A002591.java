package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002591 Largest prime factor of 3^(2n+1) - 1.
 * @author Sean A. Irvine
 */
public class A002591 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 1;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
      return Z.TWO;
    }
    mA = mA.multiply(9);
    final Z t = mA.subtract(1);
    if (mVerbose) {
      mN += 2;
      System.out.println("Doing: 3^" + mN + "-1=" + t);
    }
    return Jaguar.factor(t).largestPrimeFactor();
  }
}
