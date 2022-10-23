package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002238 Numbers k such that 21*2^k - 1 is prime.
 * @author Sean A. Irvine
 */
public class A002238 extends Sequence1 {

  private long mN = 0;
  private Z mM = Z.valueOf(21);

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mM = mM.shiftLeft(1);
      if (mM.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
