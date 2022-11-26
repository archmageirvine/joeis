package irvine.oeis.a344;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A344503 a(n) = Sum_{k=0..n} (-1)^(n-k)*binomial(n, k)^2*hypergeom([(k-n)/2, (k-n+1)/2], [k+2], 4).
 * @author Georg Fischer
 */
public class A344503 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    // a(3*n) = binomial(3*n, n) (A005809), a(3*n - 1) = -binomial(3*n - 1, n - 1) (A025174), a(3*n - 2) = 0
    ++mN;
    switch (mN % 3) {
      case 0:
        return Binomial.binomial(mN, mN / 3);
      case 1:
        return Z.ZERO;
      case 2:
      default:
        return Binomial.binomial(mN, mN / 3).negate();
    }
  }
}
