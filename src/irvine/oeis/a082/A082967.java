package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082967 Numbers n such that mu(n) + mu(n+1) + mu(n+2) + mu(n+3) + mu(n+4) + mu(n+5) + mu(n+6) = 6.
 * @author Sean A. Irvine
 */
public class A082967 extends Sequence1 {

  private long mN = 212;

  @Override
  public Z next() {
    while (true) {
      if (Functions.MOBIUS.i(++mN)
        + Functions.MOBIUS.i(mN + 1)
        + Functions.MOBIUS.i(mN + 2)
        + Functions.MOBIUS.i(mN + 3)
        + Functions.MOBIUS.i(mN + 4)
        + Functions.MOBIUS.i(mN + 5)
        + Functions.MOBIUS.i(mN + 6) == 6) {
        return Z.valueOf(mN);
      }
    }
  }
}
