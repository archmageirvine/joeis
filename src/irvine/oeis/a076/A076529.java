package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076529 Numbers k for which phi(k) = phi(k+1) - phi(k-1).
 * @author Sean A. Irvine
 */
public class A076529 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.l(++mN) == Functions.PHI.l(mN + 1) - Functions.PHI.l(mN - 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
