package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079342 Integers k that divide LS(k), where LS is the "Look and Say" function (A045918).
 * @author Sean A. Irvine
 */
public class A079342 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.LOOK_AND_SAY.z(mN).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
