package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019278 Numbers n such that sigma(sigma(n)) <code>= k*n</code> for some k.
 * @author Sean A. Irvine
 */
public class A019278 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(Cheetah.factor(mN).sigma()).sigma().mod(mN).equals(Z.ZERO)) {
        return mN;
      }
    }
  }
}

