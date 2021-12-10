package irvine.oeis.a086;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A086619 Product of first n terms of the binomial transform of the Catalan numbers (A007317).
 * MMA: Table[Product[Sum[Binomial[m, k]*Binomial[2*k, k]/(k+1), {k, 0, m}], {m, 0, n}], {n, 0, 12}].
 * @author Georg Fischer
 */
public class A086619 implements Sequence {

  private int mN = -1;
  ;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int m = 0; m <= mN; ++m) {
      Z sum = Z.ZERO;
      for (int k = 0; k <= m; ++k) {
        sum = sum.add(Binomial.binomial(m, k).multiply(Binomial.binomial(2 * k, k)).divide(k + 1));
      }
      prod = prod.multiply(sum);
    }
    return prod;
  }
}
