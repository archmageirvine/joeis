package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002982 Numbers k such that k! - 1 is prime.
 * @author Sean A. Irvine
 */
public class A002982 extends Sequence1 {

  private long mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      if (mF.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
