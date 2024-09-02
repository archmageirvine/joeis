package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a045.A045918;

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
      if (new Z(A045918.lookAndSay(mN)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
