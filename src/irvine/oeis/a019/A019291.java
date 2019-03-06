package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019291.
 * @author Sean A. Irvine
 */
public class A019291 implements Sequence {

  private Z mN = Z.valueOf(217727);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(Cheetah.factor(mN).sigma()).sigma().equals(mN.multiply(14))) {
        return mN;
      }
    }
  }
}

