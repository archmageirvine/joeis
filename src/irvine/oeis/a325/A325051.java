package irvine.oeis.a325;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A325051 a(n) = Product_{i=0..n, j=0..n, k=0..n} (i!*j!*k! + 1).
 * @author Georg Fischer
 */
public class A325051 implements Sequence {

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();
  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int i = 0; i <= mN; ++i) {
      for (int j = 0; j <= mN; ++j) {
        for (int k = 0; k <= mN; ++k) {
          prod = prod.multiply(
            FACTORIAL.factorial(i).multiply(FACTORIAL.factorial(j)).multiply(FACTORIAL.factorial(k))
              .add(1)
          );
        }
      }
    }
    return prod;
  }
}
