package irvine.oeis.a009;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009230 a(n) = lcm(n, d(n)).
 * @author Sean A. Irvine
 */
public class A009230 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.lcm(Jaguar.factor(mN).sigma0());
  }
}
