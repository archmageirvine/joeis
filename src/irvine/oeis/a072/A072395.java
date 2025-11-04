package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072395 Numbers k such that reverse(phi(k)) = k.
 * @author Sean A. Irvine
 */
public class A072395 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.l(Functions.PHI.l(++mN)) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
