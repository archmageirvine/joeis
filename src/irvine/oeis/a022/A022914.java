package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022914 Multinomial coefficients(TOP, BOTTOM), where TOP = 2^n, BOTTOM = ( C(n,0) C(n,1) C(n,2) ... C(n,n) ).
 * @author Sean A. Irvine
 */
public class A022914 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int[] den = new int[++mN + 1];
    for (int k = 0; k <= mN; ++k) {
      den[k] = Binomial.binomial(mN, k).intValueExact();
    }
    return Binomial.multinomial(1 << mN, den);
  }
}
