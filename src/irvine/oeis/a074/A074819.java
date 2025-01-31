package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074819 Numbers k such that mu(k)+mu(k+1) = 0.
 * @author Sean A. Irvine
 */
public class A074819 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.MOBIUS.i(++mN) + Functions.MOBIUS.i(mN + 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
