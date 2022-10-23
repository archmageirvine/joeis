package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002253 Numbers k such that 3*2^k+1 is prime.
 * @author Sean A. Irvine
 */
public class A002253 extends Sequence1 {

  private long mN = 0;
  private Z mM = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mM = mM.shiftLeft(1);
      if (mM.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
