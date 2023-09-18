package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065893 Which composite number is the square of n? Index of n^2 in A002808.
 * @author Sean A. Irvine
 */
public class A065893 extends A002808 {

  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).square();
    if (mN < 2) {
      return Z.ZERO;
    }
    while (true) {
      ++mM;
      if (t.equals(super.next())) {
        return Z.valueOf(mM);
      }
    }
  }
}
