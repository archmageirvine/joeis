package irvine.oeis.a226;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A226288 T(n,k) = [n/2]!*[(n+1)/2]!*C([n/2],k-1)*C([(n+1)/2],k-1).
 * @author Georg Fischer
 */
public class A226288 extends UpperLeftTriangle {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A226288() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return FACTORIAL.factorial(n / 2).multiply(FACTORIAL.factorial((n + 1) / 2)).multiply(Binomial.binomial(n / 2, k - 1)).multiply(Binomial.binomial((n + 1) / 2, k - 1));
  }
}
