package irvine.oeis.a278;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A278312 a(n) = denominator of n/(2^(2*n+1)).
 * @author Georg Fischer
 */
public class A278312 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return new Q(Z.valueOf(mN), Z.ONE.shiftLeft(2 * mN + 1)).den();
  }
}
