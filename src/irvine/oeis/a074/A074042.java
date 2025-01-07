package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a077.A077800;

/**
 * A074042 Numerator of Sum_{k=1..n} 1/A077800(k), denominator=A074043.
 * @author Sean A. Irvine
 */
public class A074042 extends A077800 {

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
