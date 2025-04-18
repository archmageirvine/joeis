package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076825 extends Sequence1 {

  private Z mU = Z.ONE;
  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      mU = Z.TWO.modPow(mU, Z.valueOf(++mN));
      if (mU.equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
