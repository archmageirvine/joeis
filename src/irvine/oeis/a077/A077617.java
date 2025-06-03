package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077617 Numbers k such that Omega(k) = Omega(k+1) + Omega(k+2).
 * @author Sean A. Irvine
 */
public class A077617 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) == Functions.BIG_OMEGA.l(mN + 1) + Functions.BIG_OMEGA.l(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
