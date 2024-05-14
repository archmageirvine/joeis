package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a066.A066150;

/**
 * A069650 Largest n-digit number with maximal number of divisors.
 * @author Sean A. Irvine
 */
public class A069650 extends A066150 {

  private Z mMax = Z.ONE;

  @Override
  public Z next() {
    mMax = mMax.multiply(10);
    final Z d = super.next();
    Z k = mMax;
    while (true) {
      k = k.subtract(1);
      if (Functions.SIGMA0.z(k).equals(d)) {
        return k;
      }
    }
  }
}
