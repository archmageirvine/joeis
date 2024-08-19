package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071847 Numbers n such that sigma(n) - sigma(reverse(n)) = phi(n).
 * @author Sean A. Irvine
 */
public class A071847 extends Sequence1 {

  private long mN = 1301;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).subtract(Functions.SIGMA.z(Functions.REVERSE.l(mN))).equals(Functions.PHI.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
