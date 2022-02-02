package irvine.oeis.a208;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A208654 Number of palindromic paths through the subset array of {1, 2,...,n}; see Comments.
 * @author Georg Fischer
 */
public class A208654 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.product(1, (mN + 1) / 2, i -> Binomial.binomial(mN, i).multiply(i))
      .multiply(Integers.SINGLETON.product((mN + 1) / 2, mN - 1, i -> Binomial.binomial(mN - 1, i)));
  }
}
