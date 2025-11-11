package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390297.
 * @author Sean A. Irvine
 */
public class A389546 extends Sequence1 {

  private long mN = 72547;

  private boolean is(final long n) {
    return Functions.SIGMA1.z(n).equals(Functions.DEDEKIND_PSI.z(n).add(Functions.SIGMA0.z(n).pow(4)));
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
