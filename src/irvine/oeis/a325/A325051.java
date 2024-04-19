package irvine.oeis.a325;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A325051 a(n) = Product_{i=0..n, j=0..n, k=0..n} (i!*j!*k! + 1).
 * @author Georg Fischer
 */
public class A325051 extends Sequence0 {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;
  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int i = 0; i <= mN; ++i) {
      for (int j = 0; j <= mN; ++j) {
        for (int k = 0; k <= mN; ++k) {
          prod = prod.multiply(
            Functions.FACTORIAL.z(i).multiply(Functions.FACTORIAL.z(j)).multiply(Functions.FACTORIAL.z(k))
              .add(1)
          );
        }
      }
    }
    return prod;
  }
}
