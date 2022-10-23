package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028491 Numbers k such that (3^k - 1)/2 is prime.
 * @author Sean A. Irvine
 */
public class A028491 extends Sequence1 {

  private int mN = 1;
  private Z mT = Z.THREE;

  @Override
  public Z next() {
    do {
      ++mN;
      mT = mT.multiply(3);
    } while (!mT.subtract(1).divide2().isProbablePrime());
    return Z.valueOf(mN);
  }
}
