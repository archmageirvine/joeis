package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002240.
 * @author Sean A. Irvine
 */
public class A002240 implements Sequence {

  private long mN = 0;
  private Z mM = Z.valueOf(33);

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
