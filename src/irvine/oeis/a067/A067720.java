package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067720 Numbers k such that phi(k^2+1) = k*phi(k+1).
 * @author Sean A. Irvine
 */
public class A067720 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Functions.PHI.z(n.square().add(1)).equals(Functions.PHI.z(mN + 1).multiply(mN))) {
        return n;
      }
    }
  }
}
