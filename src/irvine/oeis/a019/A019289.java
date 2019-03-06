package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019289.
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

