package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A054518 Emirpnons (nonprimes whose reversal is a different nonprime).
 * @author Sean A. Irvine
 */
public class A054518 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final Z reverse = Functions.REVERSE.z(n);
      if (!reverse.equals(n) && !reverse.isProbablePrime()) {
        return n;
      }
    }
  }
}
