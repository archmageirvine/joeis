package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005100.
 * @author Sean A. Irvine
 */
public class A005100 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(mN).sigma().compareTo(mN.multiply2()) < 0) {
        return mN;
      }
    }
  }
}

