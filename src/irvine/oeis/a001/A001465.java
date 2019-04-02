package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001465 Number of degree-n odd permutations of order 2.
 * @author Sean A. Irvine
 */
public class A001465 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z df = Z.ONE;
    for (long k = 0; k <= (mN - 2) / 4; ++k) {
      df = df.multiply(4 * k + 1).multiply(k == 0 ? 1 : 4 * k - 1);
      s = s.add(Binomial.binomial(mN, 4 * k + 2).multiply(df));
    }
    return s;
  }
}
