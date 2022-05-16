package irvine.oeis.a009;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009242 a(n) = lcm(n, sigma(n)).
 * @author Sean A. Irvine
 */
public class A009242 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.lcm(Jaguar.factor(mN).sigma());
  }
}
