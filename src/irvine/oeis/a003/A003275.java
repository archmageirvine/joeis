package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003275 Values of phi(n) = phi(n+1).
 * @author Sean A. Irvine
 */
public class A003275 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long phi = Functions.PHI.l(++mN);
      if (phi == Functions.PHI.l(mN + 1)) {
        return Z.valueOf(phi);
      }
    }
  }

}
