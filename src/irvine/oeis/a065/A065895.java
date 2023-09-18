package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065895 Which composite number is n^n ?.
 * @author Sean A. Irvine
 */
public class A065895 extends A002808 {

  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).pow(mN);
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
