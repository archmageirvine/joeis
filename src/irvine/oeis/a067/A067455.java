package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A067455 Let m be the product of the decimal digits in n, then a(n) = 0 if m = 0, otherwise a(n) = n!/m.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A067455 extends Sequence1 {

  private final Sequence mF = new A000142().skip();
  private int mN = 0;

  @Override
  public Z next() {
    final Z f = mF.next();
    final long v = ++mN;
    final long prod = Functions.DIGIT_PRODUCT.l(v);
    return prod == 0 ? Z.ZERO : f.divide(prod);
  }
}
