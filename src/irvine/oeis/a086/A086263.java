package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A086263 Smaller of two consecutive squarefree numbers having equal numbers of prime factors.
 * @author Sean A. Irvine
 */
public class A086263 extends A005117 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).isOne() && Functions.OMEGA.i(t) == Functions.OMEGA.i(mA)) {
        return t;
      }
    }
  }
}
