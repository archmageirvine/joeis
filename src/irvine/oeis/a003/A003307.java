package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003307 Numbers k such that 2*3^k - 1 is prime.
 * @author Sean A. Irvine
 */
public class A003307 implements Sequence {

  private Z mT = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT.multiply(3);
      if (mT.multiply2().subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }

}
