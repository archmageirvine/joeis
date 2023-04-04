package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034923 Numbers k such that 43^k - 42 is prime.
 * @author Sean A. Irvine
 */
public class A034923 extends Sequence1 {

  private Z mT = Z.valueOf(43).pow(3);
  private int mN = 3;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(43);
      ++mN;
      if (mT.subtract(42).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
