package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006033 Numbers n such that (15^n - 1)/14 is prime.
 * @author Sean A. Irvine
 */
public class A006033 extends Sequence1 {

  private Z mA = Z.valueOf(225);
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN++;
      mA = mA.multiply(15);
      if (mA.subtract(1).divide(14).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

