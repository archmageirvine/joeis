package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063848 Numbers k such that mu(k) + mu(k+1) + mu(k+2) = 2.
 * @author Sean A. Irvine
 */
public class A063848 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      if (Functions.MOBIUS.i(n) + Functions.MOBIUS.i(mN + 1) + Functions.MOBIUS.i(mN + 2) == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
