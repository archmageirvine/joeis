package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002269 Numbers k such that 39*2^k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A002269 extends Sequence1 {

  private long mN = 0;
  private Z mM = Z.valueOf(39);

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
