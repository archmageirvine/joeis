package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016054 Numbers n such that <code>(13^n - 1)/12</code> is prime.
 * @author Sean A. Irvine
 */
public class A016054 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(13);
      if (mA.subtract(1).divide(12).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
