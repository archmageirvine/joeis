package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035062 Numbers n such that 2^n does not contain the digit 7.
 * @author Sean A. Irvine
 */
public class A035062 extends Sequence1 {

  private Z mT = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      mT = mT.multiply2();
      if (mT.toString().indexOf('7') == -1) {
        return Z.valueOf(mN);
      }
    }
  }
}
