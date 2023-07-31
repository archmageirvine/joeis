package irvine.oeis.a064;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A064889 Denominators of partial sums of reciprocals of A051451 (A051451 includes lcm(1,...,x), x=power of prime from A000961 and also contains 1).
 * @author Sean A. Irvine
 */
public class A064889 extends A051451 {

  private Q mSum = Q.ZERO;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next()));
    return select(mSum);
  }
}

