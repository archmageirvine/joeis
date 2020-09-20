package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034926 Numbers n such that 101^n-100 is prime.
 * @author Sean A. Irvine
 */
public class A034926 implements Sequence {

  private Z mT = Z.valueOf(10201);
  private int mN = 2;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(101);
      ++mN;
      if (mT.subtract(100).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
