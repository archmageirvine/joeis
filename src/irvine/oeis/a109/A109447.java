package irvine.oeis.a109;
// manually deris/essent at 2022-04-27 19:28

import irvine.math.z.Z;
import irvine.oeis.a119.A119900;

/**
 * A109447 Binomial coefficients C(n,k) with n-k odd, read by rows.
 * @author Georg Fischer
 */
public class A109447 extends A119900 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isZero()) {
        return t;
      }
    }
  }
}
