package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075475 Numbers n such that reverse(phi(n+1)) = phi(n).
 * @author Sean A. Irvine
 */
public class A075475 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.l(++mN) == Functions.REVERSE.l(Functions.PHI.l(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
