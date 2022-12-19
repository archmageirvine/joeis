package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081205 Staircase on Pascal's triangle.
 * @author Georg Fischer
 */
public class A081205 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    // binomial(ceiling((n+1)/2)+(n+1), n).
    ++mN;
    return Binomial.binomial(new Q(mN + 1, 2).ceiling().intValue() + mN + 1, mN);
  }
}
