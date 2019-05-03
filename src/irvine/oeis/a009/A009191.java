package irvine.oeis.a009;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009191 <code>a(n) = gcd(n, d(n))</code>, where <code>d(n)</code> is the number of divisors of <code>n (A000005)</code>.
 * @author Sean A. Irvine
 */
public class A009191 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.gcd(Cheetah.factor(mN).sigma0());
  }
}
