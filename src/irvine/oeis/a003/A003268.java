package irvine.oeis.a003;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003268 Central Fibonomial coefficients.
 * @author Sean A. Irvine
 */
public class A003268 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    for (int k = mN / 2 + 1; k <= mN; ++k) {
      p = p.multiply(Fibonacci.fibonacci(k));
    }
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      p = p.divide(Fibonacci.fibonacci(k));
    }
    return p;
  }

}
