package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081204 Staircase on Pascal's triangle.
 * @author Georg Fischer
 */
public class A081204 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    // a(n) = binomial(ceiling((n)/2) + n, n).
    ++mN;
    return Binomial.binomial(new Q(mN, 2).ceiling().intValue() + mN, mN);
  }
}
