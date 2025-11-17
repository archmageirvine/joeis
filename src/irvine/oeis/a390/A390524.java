package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390524 Array read by ascending antidiagonals: A(n, k) = k * Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A390524 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.FIBONACCI.z(mN - mM).multiply(mM);
  }
}
