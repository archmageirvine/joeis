package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002259 Numbers k such that 17*2^k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A002259 extends Sequence1 {

  private long mN = 0;
  private Z mM = Z.valueOf(17);

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
