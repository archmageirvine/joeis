package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028491.
 * @author Sean A. Irvine
 */
public class A028491 implements Sequence {

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
