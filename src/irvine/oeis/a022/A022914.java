package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022914 Multinomial <code>coefficients(TOP</code>, BOTTOM), where TOP <code>= 2^n</code>, BOTTOM <code>= ( C(n,0) C(n,1) C(n,2) ... C(n,n) )</code>.
 * @author Sean A. Irvine
 */
public class A022914 implements Sequence {

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
