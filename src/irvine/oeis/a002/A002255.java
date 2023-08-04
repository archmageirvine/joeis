package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002255 Numbers k such that 7*4^k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A002255 extends Sequence1 {

  private long mN = 0;
  private Z mM = Z.SEVEN;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mM = mM.shiftLeft(2);
      if (mM.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
