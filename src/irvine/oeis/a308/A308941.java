package irvine.oeis.a308;
// manually prodsim/prodsi at 2021-11-28 15:50

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A308941 a(n) = Product_{k=1..n} |Stirling1(n,k)| * k!.
 * @author Georg Fischer
 */
public class A308941 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(Functions.STIRLING1.z(mN, k).abs().multiply(Functions.FACTORIAL.z(k)));
    }
    return prod;
  }
}
