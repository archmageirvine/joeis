package irvine.oeis.a012;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012249 Volume of a certain rational polytope whose points with given denominator count certain sets of Standard Tableaux.
 * @author Sean A. Irvine
 */
public class A012249 implements Sequence {

  private int mN = 0;

  protected Z a(final int n) {
    Z sum = Z.ZERO;
    for (int j = 0; j <= (n + 1) / 2; ++j) {
      sum = sum.signedAdd((j & 1) == 1, Z.valueOf(n - 2L * j + 2).pow(n - 1).multiply(Binomial.binomial(n + 2, j)));
    }
    return sum.divide2();
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
