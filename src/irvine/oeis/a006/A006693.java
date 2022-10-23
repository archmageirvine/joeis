package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006693 Modified Engel expansion of 3/7.
 * @author Sean A. Irvine
 */
public class A006693 extends Sequence1 {

  // Modified Engel expansion

  private Q mA = new Q(3, 7);

  @Override
  public Z next() {
    final Z a = mA.reciprocal().toZ();
    mA = new Q(Z.ONE, a).subtract(mA).multiply(a.add(1));
    return a;
  }
}
