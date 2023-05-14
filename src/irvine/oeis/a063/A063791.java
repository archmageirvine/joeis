package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063791 Numbers n such that 2^(n+1) - n - 2 is prime.
 * @author Sean A. Irvine
 */
public class A063791 extends Sequence1 {

  private long mN = 4;
  private Z mT = Z.EIGHT;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply2();
      if (mT.subtract(++mN).isProbablePrime()) {
        return Z.valueOf(mN - 2);
      }
    }
  }
}
