package irvine.oeis.a208;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A208661 Number of paths through the subset array of {1,2,...,n} that have range a subset of {1,2}; see Comments at A208650.
 * (2^n)*Product[Binomial[n - 1, i], {i, 1, n - 1}]
 * @author Georg Fischer
 */
public class A208661 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mN == 1 ? Z.ONE : Z.ONE.shiftLeft(mN).multiply(Integers.SINGLETON.product(1, mN - 1, i -> Binomial.binomial(mN - 1, i)));
  }
}
