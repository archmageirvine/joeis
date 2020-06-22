package irvine.oeis.a032;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032445 Number the digits of the decimal expansion of Pi: 3 is the first, 1 is the second, 4 is the third and so on; <code>a(n)</code> gives the starting position of the first occurrence of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A032445 implements Sequence {

  private static final CR PI0 = CR.PI.divide(CR.TEN); // So we can ignore the period
  private int mDigits = 1000;
  private String mPi = PI0.toString(mDigits);
  private long mN = -1;

  @Override
  public Z next() {
    final String n = String.valueOf(++mN);
    int pos;
    while ((pos = mPi.indexOf(n, 2)) < 0) {
      mDigits *= 2;
      mPi = PI0.toString(mDigits);
    }
    return Z.valueOf(pos - 1);
  }
}
