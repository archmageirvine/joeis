package irvine.oeis.a208;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A208650 Number of constant paths through the subset array of {1, 2,...,n}; see Comments.
 * n * Product[Binomial[n-1, k], {k, 1, n-1}]
 * @author Georg Fischer
 */
public class A208650 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.product(1, mN - 1, k -> Binomial.binomial(mN - 1, k)).multiply(mN);
  }
}
