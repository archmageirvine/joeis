package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007658 Numbers k such that (3^k + 1)/4 is prime.
 * @author Sean A. Irvine
 */
public class A007658 extends Sequence1 {

  private Z mT = Z.NINE;
  private int mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT.multiply(3);
      if (mT.add(1).shiftRight(2).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
