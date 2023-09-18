package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065892 Which composite number is n! ?.
 * @author Sean A. Irvine
 */
public class A065892 extends A002808 {

  private long mM = 0;
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    if (mN < 3) {
      return Z.ZERO;
    }
    while (true) {
      ++mM;
      if (mF.equals(super.next())) {
        return Z.valueOf(mM);
      }
    }
  }
}
