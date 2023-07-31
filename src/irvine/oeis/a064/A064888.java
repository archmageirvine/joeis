package irvine.oeis.a064;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A064888 Numerators of partial sums of 1/A051451.
 * @author Sean A. Irvine
 */
public class A064888 extends A051451 {

  private Q mSum = Q.ZERO;
  {
    super.next();
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next()));
    return select(mSum);
  }
}

