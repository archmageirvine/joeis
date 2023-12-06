package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067081.
 * @author Sean A. Irvine
 */
public class A067171 extends Sequence1 {

  private Z mS = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s = mS;
      mS = Jaguar.factor(++mN + 1).sigma();
      if (s.add(mS).equals(Jaguar.factor(2 * mN + 1).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
