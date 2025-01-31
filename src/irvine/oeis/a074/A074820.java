package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074820 Numbers k such that mu(k) = mu(k+2), where mu is the M\u00f6bius function (A008683).
 * @author Sean A. Irvine
 */
public class A074820 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.MOBIUS.i(++mN) == Functions.MOBIUS.i(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
