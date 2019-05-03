package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019283 Let <code>sigma_m (n)</code> be result of applying <code>sum-of-divisors</code> function m times to n; call <code>n (m,k)-perfect</code> if <code>sigma_m (n) = k*n</code>; sequence gives the <code>(2,6)-perfect</code> numbers.
 * @author Sean A. Irvine
 */
public class A019283 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(Cheetah.factor(mN).sigma()).sigma().equals(mN.multiply(6))) {
        return mN;
      }
    }
  }
}

