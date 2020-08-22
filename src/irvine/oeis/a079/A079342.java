package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a045.A045918;

/**
 * A079342 Integers n that divide LS(n), where LS is the "Look and Say" function (A045918).
 * @author Sean A. Irvine
 */
public class A079342 implements Sequence {

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
