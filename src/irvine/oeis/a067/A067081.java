package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067081 Numbers n such that sigma(n+1) = 2*sigma(n).
 * @author Sean A. Irvine
 */
public class A067081 extends Sequence1 {

  private long mN = 4;
  private Z mS = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z s = mS;
      mS = Jaguar.factor(++mN).sigma();
      if (mS.equals(s.multiply2())) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
