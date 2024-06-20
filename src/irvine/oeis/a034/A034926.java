package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034926 Numbers k such that 101^k-100 is prime.
 * @author Sean A. Irvine
 */
public class A034926 extends Sequence1 {

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
