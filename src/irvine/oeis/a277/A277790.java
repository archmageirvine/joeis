package irvine.oeis.a277;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A277790 Numerator of sum of reciprocals of proper divisors of n.
 * @author Georg Fischer
 */
public class A277790 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Rationals.SINGLETON.sumdiv(mN, d -> d < mN ? new Q(1, d) : Q.ZERO).num();
  }
}
