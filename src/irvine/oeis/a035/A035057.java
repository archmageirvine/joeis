package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035057 Numbers n such that 2^n does not contain the digit 1 (probably finite).
 * @author Sean A. Irvine
 */
public class A035057 extends Sequence1 {

  private Z mT = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply2();
      ++mN;
      if (mT.toString().indexOf('1') == -1) {
        return Z.valueOf(mN);
      }
    }
  }
}
