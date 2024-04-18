package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007694 Numbers k such that phi(k) divides k.
 * @author Sean A. Irvine
 */
public class A007694 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % Functions.PHI.l(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
