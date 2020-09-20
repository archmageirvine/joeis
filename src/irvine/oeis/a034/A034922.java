package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034922 Numbers k such that 17^k - 16 is prime.
 * @author Sean A. Irvine
 */
public class A034922 implements Sequence {

  private Z mT = Z.valueOf(17).pow(10);
  private int mN = 10;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(17);
      ++mN;
      if (mT.subtract(16).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
