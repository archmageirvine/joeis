package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006032 Numbers n such that (14^n - 1)/13 is prime.
 * @author Sean A. Irvine
 */
public class A006032 implements Sequence {

  private Z mA = Z.valueOf(196);
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN++;
      mA = mA.multiply(14);
      if (mA.subtract(1).divide(13).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

