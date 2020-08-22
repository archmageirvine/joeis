package irvine.oeis.a023;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023417 Numerator of n*(n-3)*(3*n^2-6*n+2)/(3*(n-1)*(n-2)).
 * @author Sean A. Irvine
 */
public class A023417 implements Sequence {

  private Z mN = Z.TWO;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return select(new Q(mN.multiply(mN.subtract(3)).multiply(mN.multiply(3).subtract(6).multiply(mN).add(2)), mN.subtract(1).multiply(mN.subtract(2)).multiply(3)));
  }
}
