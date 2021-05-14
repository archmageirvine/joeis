package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034924 Numbers k such that 47^k-46 is prime.
 * @author Sean A. Irvine
 */
public class A034924 implements Sequence {

  private Z mT = Z.valueOf(47).pow(4);
  private int mN = 4;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(47);
      ++mN;
      if (mT.subtract(46).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
