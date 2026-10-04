package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063480 Numbers k such that cototient(k+3) = 2*cototient(k), where cototient(k) = k - phi(k) (A051953).
 * @author Sean A. Irvine
 */
public class A063480 extends Sequence1 {

  private long mN = 38;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.l(++mN) * 2 - Functions.PHI.l(mN + 3) == mN - 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
