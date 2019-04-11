package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019289 Let sigma_m <code>(n)</code> be result of applying sum-of-divisors function m times to n; call n (m,k)-perfect if sigma_m <code>(n) =</code> k*n; sequence gives the <code>(2</code>,12)-perfect numbers.
 * @author Sean A. Irvine
 */
public class A019289 implements Sequence {

  private Z mN = Z.valueOf(2200379);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(Cheetah.factor(mN).sigma()).sigma().equals(mN.multiply(12))) {
        return mN;
      }
    }
  }
}

