package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077754 Smallest multiple of n with two or more digits, none of them zeros, whose digit sum equals n, or 0 if no such multiple exists.
 * @author Sean A. Irvine
 */
public class A077754 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || mN == 2 || mN == 5 || mN == 11 || mN % 10 == 0) {
      return Z.ZERO;
    }
    long m = mN;
    while (true) {
      m += mN;
      if ((Functions.SYNDROME.i(m) & 1) == 0 && Functions.DIGIT_SUM.l(m) == mN) {
        return Z.valueOf(m);
      }
    }
  }
}

