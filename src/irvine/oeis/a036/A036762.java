package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a033.A033950;

/**
 * A036762 The integer values of x/d(x) in order of magnitude of x in A033950.
 * @author Sean A. Irvine
 */
public class A036762 extends A033950 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final Z[] qr = n.divideAndRemainder(Functions.SIGMA0.z(n));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
