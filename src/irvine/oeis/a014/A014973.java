package irvine.oeis.a014;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014973 a(n) = n/gcd(n,(n-1)!).
 * @author Sean A. Irvine
 */
public class A014973 extends Sequence1 {

  private Z mF = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    mF = mF.multiply(mN);
    return new Q(mF, mN.square()).den();
  }
}
