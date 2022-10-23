package irvine.oeis.a009;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009194 a(n) = gcd(n, sigma(n)).
 * @author Sean A. Irvine
 */
public class A009194 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.gcd(Jaguar.factor(mN).sigma());
  }
}
