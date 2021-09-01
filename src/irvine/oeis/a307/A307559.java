package irvine.oeis.a307;
// manually floor at 2021-09-01 13:58

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A307559 a(n) = floor(n/3) * (n - floor(n/3)) * (n - floor(n/3) - 1).
 * @author Georg Fischer
 */
public class A307559 extends FloorSequence {

  /** Construct the sequence */
  public A307559() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    final Z fn3 = CR.valueOf(n).divide(CR.THREE).floor();
    final Z nFn3 = Z.valueOf(n).subtract(fn3);
    return fn3.multiply(nFn3).multiply(nFn3.subtract(Z.ONE));
  }

}
