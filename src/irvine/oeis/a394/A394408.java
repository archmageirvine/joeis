package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003592;

/**
 * A394408 allocated for Michael De Vlieger.
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
