package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019288.
 * @author Sean A. Irvine
 */
public class A019288 implements Sequence {

  private Z mN = Z.valueOf(4404479);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(Cheetah.factor(mN).sigma()).sigma().equals(mN.multiply(11))) {
        return mN;
      }
    }
  }
}

