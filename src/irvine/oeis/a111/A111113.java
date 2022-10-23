package irvine.oeis.a111;
// manually euleras at 2021-11-23 12:41

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A111113 a(2^m) = 1, a(2^m+1) = -1 (m&gt;0), otherwise a(n) = 0.
 * @author Georg Fischer
 */
public class A111113 extends Sequence0 {

  private Z mN = Z.NEG_ONE;
  private Z mTwo = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mTwo)) {
      return Z.ONE;
    } else if (mTwo.compareTo(mN) < 0) {
      mTwo = mTwo.shiftLeft(1);
      return Z.NEG_ONE;
    } else {
      return Z.ZERO;
    }
  }
}
