package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077726 Smallest number beginning with n and having a digit sum n.
 * @author Sean A. Irvine
 */
public class A077726 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long m = 0;
    while (true) {
      if (Functions.DIGIT_SUM.l(++m) == mN && String.valueOf(m).startsWith(s)) {
        return Z.valueOf(m);
      }
    }
  }
}
