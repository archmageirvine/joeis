package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a014.A014076;

/**
 * A046446 Nonprimes whose prime factors contain only odd digits.
 * @author Sean A. Irvine
 */
public class A046446 extends A014076 {

  private boolean isOddDigits(final Z t) {
    final int[] cnts = ZUtils.digitCounts(t);
    return cnts[0] == 0 && cnts[2] == 0 && cnts[4] == 0 && cnts[6] == 0 && cnts[8] == 0;
  }

  private boolean is(final Z t) {
    for (final Z p : Cheetah.factor(t).toZArray()) {
      if (!isOddDigits(p)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (is(t)) {
        return t;
      }
    }
  }
}
