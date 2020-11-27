package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
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
      final Z[] qr = n.divideAndRemainder(Cheetah.factor(n).sigma0());
      if (Z.ZERO.equals(qr[1])) {
        return qr[0];
      }
    }
  }
}
