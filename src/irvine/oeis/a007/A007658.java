package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007658 Numbers n such that (3^n + 1)/4 is prime.
 * @author Sean A. Irvine
 */
public class A007658 implements Sequence {

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
