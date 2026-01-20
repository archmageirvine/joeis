package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083289 Least k such that 10^n+k is a brilliant number (cf. A078972).
 * @author Sean A. Irvine
 */
public class A083289 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(10);
    }
    if ((mN & 1) == 0) {
      return Functions.NEXT_PRIME.z(Z.TEN.pow(mN / 2).subtract(1)).square().subtract(mA);
    }
    Z t = mA;
    while (true) {
      if (Predicates.BRILLIANT.is(2, t)) {
        return t.subtract(mA);
      }
      t = t.add(1);
    }
  }
}

