package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065895 Which composite number is n^n ?: a(n) = k such that A002808(k) = n^n, or 0 if n^n is not composite.
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
