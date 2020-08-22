package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033147 Decimal expansion of n! begins with n.
 * @author Sean A. Irvine
 */
public class A033147 implements Sequence {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m % 10 == 0) {
        m /= 10;
      }
      while (m % 5 == 0) {
        mF = mF.divide2();
        m /= 5;
      }
      mF = mF.multiply(m);
      if (mF.toString().startsWith(String.valueOf(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
