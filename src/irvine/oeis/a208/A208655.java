package irvine.oeis.a208;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A208655 Number of palindromic paths starting with 1 through the subset array of {1,2,...,n}; see Comments.
 * @author Georg Fischer
 */
public class A208655 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.product(1, (mN + 1) / 2, i -> Binomial.binomial(mN, i).multiply(i))
      .multiply(Integers.SINGLETON.product((mN + 1) / 2, mN - 1, i -> Binomial.binomial(mN - 1, i)))
      .divide(mN);
  }
}
