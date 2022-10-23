package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014224 Numbers n such that 3^n - 2 is prime.
 * @author Sean A. Irvine
 */
public class A014224 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT.multiply(3);
      if (mT.subtract(2).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
