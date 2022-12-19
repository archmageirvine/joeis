package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081131 a(n) = n^(n-2) * binomial(n,2).
 * @author Georg Fischer
 */
public class A081131 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 2).multiply(Z.valueOf(mN).pow(mN - 2));
  }
}
