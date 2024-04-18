package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001494 Numbers k such that phi(k) = phi(k+2).
 * @author Sean A. Irvine
 */
public class A001494 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.PHI.l(mN) == Functions.PHI.l(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
