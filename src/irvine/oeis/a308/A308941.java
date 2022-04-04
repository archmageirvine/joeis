package irvine.oeis.a308;
// manually prodsim/prodsi at 2021-11-28 15:50

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A308941 a(n) = Product_{k=1..n} |Stirling1(n,k)| * k!.
 * @author Georg Fischer
 */
public class A308941 implements Sequence {

  private int mN = -1;
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(irvine.math.z.Stirling.firstKind(mN, k).abs().multiply(FACTORIAL.factorial(k)));
    }
    return prod;
  }
}
