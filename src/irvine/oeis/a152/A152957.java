package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a045.A045918;

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
      if (Z.valueOf(mN).mod(new Z(A045918.lookAndSay(mN))).isZero()) {
        return Z.valueOf(mN);
      }
      /*
      if (new Z(A045918.lookAndSay(mN)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
      */
    }
  }
}
