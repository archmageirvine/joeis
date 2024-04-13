package irvine.oeis.a307;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A307812 Triangular numbers t(n) with a zeroless decimal representation such that (product of decimal digits of t(n)) / n is an integer.
 * @author Sean A. Irvine
 */
public class A307812 extends A000217 {

  /** Construct the sequence. */
  public A307812() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z prod = Functions.DIGIT_PRODUCT.z(t);
      if (!prod.isZero() && prod.mod(mN) == 0) {
        return t;
      }
    }
  }
}
