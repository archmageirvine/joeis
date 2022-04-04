package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Fibonacci;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000557 Expansion of e.g.f.: 1/(1-2*sinh(x)).
 * @author Sean A. Irvine
 */
public class A000557 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(mF.factorial(k)
                .multiply(Fibonacci.fibonacci(k + 2))
                .multiply(Stirling.secondKind(mN, k)));
    }
    return s;
  }
}
