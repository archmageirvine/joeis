package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A072443 Nonsquares which are the product of two numbers with the same digits (leading zeros are forbidden).
 * @author Sean A. Irvine
 */
public class A072443 extends A000037 {

  private boolean is(final Z n) {
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (Functions.DIGIT_SORT_DESCENDING.z(d).equals(Functions.DIGIT_SORT_DESCENDING.z(n.divide(d)))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (is(n)) {
        return n;
      }
    }
  }
}

