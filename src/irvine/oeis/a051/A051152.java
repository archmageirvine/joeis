package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051152.
 * @author Sean A. Irvine
 */
public class A051152 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = Cheetah.factor(mN).sigma(-1);
      if (!s.equals(mN) && Cheetah.factor(s).sigma(-1).equals(mN)) {
        return mN;
      }
    }
  }
}
