package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077728 a(n) = A077727(n)/n.
 * @author Sean A. Irvine
 */
public class A077728 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 11) {
      return Z.ZERO;
    }
    final String s = String.valueOf(mN);
    long m = 0;
    while (true) {
      m += mN;
      if (Functions.DIGIT_SUM.l(m) == mN && String.valueOf(m).startsWith(s)) {
        return Z.valueOf(m / mN);
      }
    }
  }
}
