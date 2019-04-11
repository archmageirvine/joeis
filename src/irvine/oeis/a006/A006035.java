package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006035 Numbers n such that <code>(19^n-1)/18</code> is prime.
 * @author Sean A. Irvine
 */
public class A006035 implements Sequence {

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

