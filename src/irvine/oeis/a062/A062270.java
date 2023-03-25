package irvine.oeis.a062;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062270 Numerators in partial products of the twin prime constant.
 * @author Sean A. Irvine
 */
public class A062270 extends A000040 {

  private Q mM = Q.ONE;
  {
    super.next();
    setOffset(2);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mM = mM.multiply(Q.ONE.subtract(new Q(Z.ONE, super.next().subtract(1).square())));
    return select(mM);
  }
}

