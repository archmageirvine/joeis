package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004063.
 * @author Sean A. Irvine
 */
public class A004063 implements Sequence {

  private Z mSevens = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSevens = mSevens.multiply(7);
      if (mSevens.subtract(1).divide(6).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
