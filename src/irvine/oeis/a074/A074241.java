package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074241 Numbers n such that phi(n+1) = reverse(phi(n)).
 * @author Sean A. Irvine
 */
public class A074241 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.l(Functions.PHI.l(++mN)) == Functions.PHI.l(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
