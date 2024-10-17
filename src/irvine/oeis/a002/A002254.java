package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002254 Numbers k such that 5*2^k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A002254 extends Sequence1 {

  private long mN = 0;
  private Z mM = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mM = mM.multiply2();
      if (mM.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
