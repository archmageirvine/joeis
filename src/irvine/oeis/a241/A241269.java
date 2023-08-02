package irvine.oeis.a241;
// manually anopan 0,0

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A241269 Denominator of c(n) = (n^2+n+2)/((n+1)*(n+2)*(n+3)).
 * @author Georg Fischer
 */
public class A241269 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return new Q((long) mN * mN + mN + 2, (long) (mN + 1) * (mN + 2) * (mN + 3)).den();
  }
}
