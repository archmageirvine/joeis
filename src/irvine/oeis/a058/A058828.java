package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058828 Numbers n such that 6^n + n is prime.
 * @author Sean A. Irvine
 */
public class A058828 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(6);
      if (mA.add(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
