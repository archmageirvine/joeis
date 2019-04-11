package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005542 Numbers n such that <code>10*3^n - 1</code> is prime.
 * @author Sean A. Irvine
 */
public class A005542 implements Sequence {

  private Z mA = Z.TEN;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply(3);
      }
      if (mA.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
