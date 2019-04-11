package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006033 Numbers n such that <code>(15^n - 1)/14</code> is prime.
 * @author Sean A. Irvine
 */
public class A006033 implements Sequence {

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

