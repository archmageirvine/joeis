package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A127670 Discriminants of Chebyshev S-polynomials A049310.
 * @author Georg Fischer
 */
public class A127670 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(n) = ((n+1)^(n-2))*2^n, n >= 1.
    ++mN;
    return (mN == 1) ? Z.ONE : Z.ONE.shiftLeft(mN).multiply(Z.valueOf(mN + 1).pow(mN - 2));
  }
}
