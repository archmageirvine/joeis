package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051152.
 * @author Sean A. Irvine
 */
public class A051153 implements Sequence {

  private Z mN = Z.valueOf(246);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = Cheetah.factor(mN).sigma(-1);
      if (Cheetah.factor(s).sigma(-1).equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}
