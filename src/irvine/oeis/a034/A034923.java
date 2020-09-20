package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034923 Numbers n such that 43^n-42 is prime.
 * @author Sean A. Irvine
 */
public class A034923 implements Sequence {

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
