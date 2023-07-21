package irvine.oeis.a064;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A064646 Numerators of partial sums of reciprocals of primorial numbers.
 * @author Sean A. Irvine
 */
public class A064646 extends A002110 {

  private Q mA = Q.ZERO;
  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    mA = mA.add(new Q(super.next()).reciprocal());
    return mA.num();
  }
}
