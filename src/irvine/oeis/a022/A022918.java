package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022918 Multinomial <code>coefficients(TOP</code>, BOTTOM), where TOP <code>= n(n+1)(2n+1)/6</code>, BOTTOM <code>= ( 1^2 2^2</code> ... <code>n^2 )</code>.
 * @author Sean A. Irvine
 */
public class A022918 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final int[] den = new int[++mN + 1];
    for (int k = 0; k <= mN; ++k) {
      den[k] = k * k;
    }
    return Binomial.multinomial(mN * (mN + 1) * (2 * mN + 1) / 6, den);
  }
}
