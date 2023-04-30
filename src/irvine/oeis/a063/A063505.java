package irvine.oeis.a063;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A063505 Number of n X n upper triangular binary matrices over GF(2) B such that B^2 = 0.
 * @author Sean A. Irvine
 */
public class A063505 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    final int n2 = ++mN / 2;
    return Integers.SINGLETON.sum(0, mN / 6, k -> Binomial.binomial(mN, n2 - 3L * k).subtract(Binomial.binomial(mN, n2 - 3L * k - 1)).shiftLeft((mN & 1) == 0 ? n2 * n2 - 3 * k * k - k : n2 * n2 + n2 - 3 * k * k - 2 * k));
  }
}
