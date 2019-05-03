package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019279 Superperfect numbers: <code>sigma(sigma(n)) = 2n</code> where sigma is the <code>sum-of-divisors</code> function <code>A000203</code>.
 * @author Sean A. Irvine
 */
public class A019279 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(Cheetah.factor(mN).sigma()).sigma().equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}

