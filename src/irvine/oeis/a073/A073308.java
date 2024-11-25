package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073308 Numbers k such that k! + k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A073308 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mF = mF.multiply(mN);
      }
      if (mF.add(mN + 1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

