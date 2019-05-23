package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022919 Multinomial <code>coefficients(TOP</code>, BOTTOM), where TOP <code>= n^2</code>, BOTTOM <code>= ( 1 3 5</code> ... <code>2n-1 )</code>.
 * @author Sean A. Irvine
 */
public class A022919 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final int[] den = new int[++mN];
    for (int k = 0; k < mN; ++k) {
      den[k] = 2 * k + 1;
    }
    return Binomial.multinomial(mN * mN, den);
  }
}
