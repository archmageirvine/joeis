package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004062.
 * @author Sean A. Irvine
 */
public class A004062 implements Sequence {

  private Z mSixes = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSixes = mSixes.multiply(6);
      if (mSixes.subtract(1).divide(5).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
