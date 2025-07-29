package irvine.oeis.a152;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A152957 Numbers n such that LS(n) divides n, where LS is the "Look and Say" function (A045918).
 * @author Sean A. Irvine
 */
public class A152957 extends Sequence1 {

  private long mN = 21;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.valueOf(mN).mod(Functions.LOOK_AND_SAY.z(mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
