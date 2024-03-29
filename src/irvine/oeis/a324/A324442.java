package irvine.oeis.a324;
// Generated by gen_seq4.pl prodsi2 at 2021-11-20 22:11

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A324442 a(n) = Product_{i=1..n, j=1..n} (i^2 + j).
 * @author Georg Fischer
 */
public class A324442 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long i = 1; i <= mN; ++i) {
      for (long j = 1; j <= mN; ++j) {
        prod = prod.multiply(Z.valueOf(i * i + j));
      }
    }
    return prod;
  }
}
