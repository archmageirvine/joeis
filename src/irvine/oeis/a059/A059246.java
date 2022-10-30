package irvine.oeis.a059;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006218;

/**
 * A059246 Numerator of Sum_{j=1..n} d(j)/n, where d = number of divisors function (A000005).
 * @author Sean A. Irvine
 */
public class A059246 extends A006218 {

  private Z mN = Z.ZERO;
  {
    setOffset(1);
    super.next();
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return select(new Q(super.next(), mN));
  }
}
