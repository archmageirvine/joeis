package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A023106 a(n) is a power of the sum of its digits.
 * @author Sean A. Irvine
 */
public class A023106 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.compareTo(Z.TEN) < 0) {
        return mN;
      }
      final long s = Functions.DIGIT_SUM.l(mN);
      if (s > 1 && mN.mod(s) == 0 && mN.equals(Z.valueOf(s).pow(Math.round(mN.log(s))))) {
        return mN;
      }
    }
  }
}
