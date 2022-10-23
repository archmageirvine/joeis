package irvine.oeis.a014;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014058 a(n) = ceiling((n+1/n)^n).
 * @author Sean A. Irvine
 */
public class A014058 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Q q = new Q(1, ++mN).add(mN).pow(mN);
    return q.isInteger() ? q.toZ() : q.toZ().add(1);
  }
}
