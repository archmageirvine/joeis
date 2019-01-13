package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006693.
 * @author Sean A. Irvine
 */
public class A006693 implements Sequence {

  // Modified Engel expansion

  private Q mA = new Q(3, 7);

  @Override
  public Z next() {
    final Z a = mA.reciprocal().toZ();
    mA = new Q(Z.ONE, a).subtract(mA).multiply(a.add(1));
    return a;
  }
}
