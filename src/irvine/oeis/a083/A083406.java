package irvine.oeis.a083;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066531 Numbers which can be expressed as the product of a number and its reversal in at least two different ways.
 * @author Sean A. Irvine
 */
public class A083406 extends Sequence1 {

  private long mN = 250;

  static boolean is(final Z n) {
    int cnt = 0;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final Z e = n.divide(dd);
      if (dd.compareTo(e) >= 0 && Functions.REVERSE.z(dd).equals(e) && ++cnt >= 2) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z s = Z.valueOf(mN).square();
      if (is(s)) {
        return s;
      }
    }
  }
}
