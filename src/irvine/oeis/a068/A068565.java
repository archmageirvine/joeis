package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068565 Denominators of Sum_{k=1..n} 1/(k * 2^k).
 * @author Sean A. Irvine
 */
public class A068565 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private long mN = 0;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, Z.valueOf(++mN).shiftLeft(mN)));
    return select(mSum);
  }
}

