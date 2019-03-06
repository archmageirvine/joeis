package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019292.
 * @author Sean A. Irvine
 */
public class A019292 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(Cheetah.factor(Cheetah.factor(mN).sigma()).sigma()).sigma().mod(mN).equals(Z.ZERO)) {
        return mN;
      }
    }
  }
}

