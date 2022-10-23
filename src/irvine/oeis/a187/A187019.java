package irvine.oeis.a187;
// manually hygeom at 2022-08-05 15:24

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A187019 Coefficient of x^n in expansion of (1+n*x+(n+1)*x^2)^n.
 * (n) = Sum (C(n, k)*C(n-k, n-2*k)*n^(n-2*k)*(n+1)^k, k=0..floor(n/2)).
 * @author Georg Fischer
 */
public class A187019 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN / 2, k -> Binomial.binomial(mN, k)
      .multiply(Binomial.binomial(mN - k, mN - 2 * k))
      .multiply(Z.valueOf(mN).pow(mN - 2 * k))
      .multiply(Z.valueOf(mN + 1).pow(k)));
  }
}
