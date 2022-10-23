package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006035 Numbers n such that (19^n-1)/18 is prime.
 * @author Sean A. Irvine
 */
public class A006035 extends Sequence1 {

  private Z mA = Z.valueOf(361);
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN++;
      mA = mA.multiply(19);
      if (mA.subtract(1).divide(18).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

