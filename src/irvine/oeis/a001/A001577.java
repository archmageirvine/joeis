package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

/**
 * A001577 An operational recurrence.
 * @author Sean A. Irvine
 */
public class A001577 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    for (int k = 1; k < mN; ++k) {
      p = p.multiply(Fibonacci.fibonacci(k).pow(Fibonacci.fibonacci(mN - k)));
    }
    return p;
  }
}
