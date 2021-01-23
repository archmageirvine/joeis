package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

/**
 * A000556 Expansion of exp(-x) / (1 - exp(x) + exp(-x)).
 * @author Sean A. Irvine
 */
public class A000556 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(mF.factorial(k)
                .multiply(Fibonacci.fibonacci(k + 1))
                .multiply(Stirling.secondKind(mN, k)));
    }
    return s;
  }
}
