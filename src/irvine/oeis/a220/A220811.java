package irvine.oeis.a220;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A220811 Numerators of the Verhulst sequence x(n+1)=4*x(n)-3*x(n)^2, x(0)=1/10.
 * @author Sean A. Irvine
 */
public class A220811 implements Sequence {

  private Q mA = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mA = mA == null ? new Q(1, 10) : mA.multiply(4).subtract(mA.square().multiply(3));
    return select(mA);
  }
}
