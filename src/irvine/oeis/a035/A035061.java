package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035061 Numbers n such that 2^n does not contain the digit 6 (probably finite).
 * @author Sean A. Irvine
 */
public class A035061 implements Sequence {

  private Z mT = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      mT = mT.multiply2();
      if (mT.toString().indexOf('6') == -1) {
        return Z.valueOf(mN);
      }
    }
  }
}
