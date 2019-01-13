package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004061.
 * @author Sean A. Irvine
 */
public class A004061 implements Sequence {

  private Z mFives = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mFives = mFives.multiply(5);
      if (mFives.subtract(1).shiftRight(2).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
