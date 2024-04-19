package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000033 Coefficients of m\u00e9nage hit polynomials.
 * @author Sean A. Irvine
 */
public class A000033 extends Sequence1 {

  private final MemoryFactorial mFactorial = MemoryFactorial.SINGLETON;
  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 2; k <= mN; ++k) {
      final int h = 2 * mN;
      final Z v = Functions.FACTORIAL.z(h - k - 1).divide(Functions.FACTORIAL.z(h - 2 * k))
        .multiply(Functions.FACTORIAL.z(mN - k)).divide(Functions.FACTORIAL.z(k - 2));
      sum = sum.signedAdd((k & 1) == 0, v);
    }
    return sum.multiply(mN);
  }

}

