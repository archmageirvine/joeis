package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014224 Numbers n such that <code>3^n - 2</code> is prime.
 * @author Sean A. Irvine
 */
public class A014224 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT.multiply(3);
      if (mT.subtract(2).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
