package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019293 Let <code>sigma_m (n)</code> be result of applying <code>sum-of-divisors</code> function m times to n; call <code>n (m,k)-perfect</code> if <code>sigma_m (n) = k*n</code>; sequence gives the <code>(4,k)-perfect</code> numbers.
 * @author Sean A. Irvine
 */
public class A019293 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(Cheetah.factor(Cheetah.factor(Cheetah.factor(mN).sigma()).sigma()).sigma()).sigma().mod(mN).equals(Z.ZERO)) {
        return mN;
      }
    }
  }
}

