package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003592;

/**
 * A394408 Lesser of two consecutive numbers of the form 2^i*5^j with i, j &gt;= 0, that are coprime.
 * @author Sean A. Irvine
 */
public class A394408 extends A003592 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (Functions.GCD.z(t, mA).isOne()) {
        return t;
      }
    }
  }
}
