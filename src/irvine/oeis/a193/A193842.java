package irvine.oeis.a193;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A193842 Triangular array: the fission of the polynomial sequence ((x+1)^n: n &gt;= 0) by the polynomial sequence ((x+2)^n: n &gt;= 0). (Fission is defined at Comments.).
 * T(n, k) = sum(j=0, k, 3^(k-j)*binomial(n-j, k-j));
 * @author Georg Fischer
 */
public class A193842 extends Triangle {

  /** Construct the sequence. */
  public A193842() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    if (k == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= k; ++j) {
      sum = sum.add(Binomial.binomial(n - j, k - j).multiply(Z.THREE.pow(k - j)));
    }
    return sum;
  }
}
