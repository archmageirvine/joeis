package irvine.oeis.a010;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A010048 Triangle of Fibonomial coefficients, read by rows.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A010048 extends Triangle {

  /** Construct the sequence. */
  public A010048() {
    hasRAM(true);
  }

  @Override
  protected Z compute(final int n, final int k) {
    if (k == 0 || k == n) {
      return Z.ONE;
    }
    return get(n - 1, k - 1).multiply(Functions.FIBONACCI.z(n - k - 1)).add(get(n - 1, k).multiply(Functions.FIBONACCI.z(k + 1)));
  }
}

