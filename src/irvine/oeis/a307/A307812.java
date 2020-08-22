package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000217;

/**
 * A307812 Triangular numbers t(n) with a zeroless decimal representation such that (product of decimal digits of t(n)) / n is an integer.
 * @author Sean A. Irvine
 */
public class A307812 extends A000217 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z prod = ZUtils.digitProduct(t);
      if (!Z.ZERO.equals(prod) && prod.mod(mN) == 0) {
        return t;
      }
    }
  }
}
