package irvine.oeis.a056;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056775 Numbers k such that phi(k+12) = phi(k) + 12.
 * @author Sean A. Irvine
 */
public class A056775 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (Euler.phiAsLong(++mN + 12) == Euler.phiAsLong(mN) + 12) {
        return Z.valueOf(mN);
      }
    }
  }
}
