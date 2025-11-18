package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390579 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A390579 extends Sequence1 {

  private long mN = 2488019;

  private boolean is(final long n) {
    return Functions.SIGMA1.z(n).equals(Functions.DEDEKIND_PSI.z(n).add(Functions.PHI.l(n)).add(Functions.SIGMA0.z(n).pow(4)));
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
