package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006552 Numbers k such that k*3^k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A006552 extends Sequence1 {

  private long mN = 1;
  private Z mT = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT.multiply(3);
      if (mT.multiply(mN).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
