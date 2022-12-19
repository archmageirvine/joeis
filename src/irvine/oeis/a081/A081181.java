package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081181 Staircase on Pascal's triangle.
 * @author Georg Fischer
 */
public class A081181 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    // a(n) = binomial(floor((n + 1)/2) + (n + 1), n).
    ++mN;
    return Binomial.binomial((mN + 1) / 2 + mN + 1, mN);
  }
}
