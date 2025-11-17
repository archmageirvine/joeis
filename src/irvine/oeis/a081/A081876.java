package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081876 a(n) is the starting position of the second occurrence of a string of the initial n decimal digits of Pi in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A081876 extends Sequence0 {

  private static final CR PI0 = CR.PI.divide(CR.TEN); // So we can ignore the period
  private int mDigits = 1000;
  private String mPi = PI0.toString(mDigits);
  private int mN = 2;

  @Override
  public Z next() {
    final String piN = mPi.substring(2, ++mN);
    int pos;
    while ((pos = mPi.indexOf(piN, mN)) < 0) {
      mDigits *= 2;
      mPi = PI0.toString(mDigits);
    }
    return Z.valueOf(pos - 2);
  }
}
