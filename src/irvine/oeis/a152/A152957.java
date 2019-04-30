package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a045.A045918;

/**
 * A152957 Numbers n such that <code>LS(n)</code> divides n, where LS is the "Look and Say" function (A045918).
 * @author Sean A. Irvine
 */
public class A152957 implements Sequence {

  private long mN = 21;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(Z.valueOf(mN).mod(new Z(A045918.lookAndSay(mN))))) {
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
