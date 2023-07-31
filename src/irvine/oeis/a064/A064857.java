package irvine.oeis.a064;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A064857 Numerators of partial sums of reciprocals of lcm(1..n) = A003418(n).
 * @author Sean A. Irvine
 */
public class A064857 extends A003418 {

  {
    super.next();
    setOffset(1);
  }
  private Q mSum = Q.ZERO;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next()));
    return select(mSum);
  }
}

