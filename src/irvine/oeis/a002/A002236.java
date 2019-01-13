package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002236.
 * @author Sean A. Irvine
 */
public class A002236 implements Sequence {

  private long mN = 0;
  private Z mM = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mM = mM.shiftLeft(1);
      if (mM.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
