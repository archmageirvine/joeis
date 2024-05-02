package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064148 Numbers k such that mu(k) = mu(k+1), where mu is the M\u00f6bius function (A008683).
 * @author Sean A. Irvine
 */
public class A064148 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.MOBIUS.i(++mN) == Functions.MOBIUS.i(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
