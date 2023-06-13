package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064119 Numbers k such that the first k digits of the Golden Ratio form a prime.
 * @author Sean A. Irvine
 */
public class A064119 extends Sequence1 {

  private long mN = 1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT.multiply(10);
      if (CR.PHI.multiply(mT).floor().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
