package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063849 Numbers k such that mu(k) + mu(k+1) + mu(k+2) = 1.
 * @author Sean A. Irvine
 */
public class A063849 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Functions.MOBIUS.i(++mN) + Functions.MOBIUS.i(mN + 1) + Functions.MOBIUS.i(mN + 2) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
