package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023197.
 * @author Sean A. Irvine
 */
public class A023197 implements Sequence {

  private Z mN = Z.valueOf(119);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(mN).sigma().compareTo(mN.multiply(3)) >= 0) {
        return mN;
      }
    }
  }
}
