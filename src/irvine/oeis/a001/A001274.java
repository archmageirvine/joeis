package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001274 Numbers k such that phi(k) = phi(k+1).
 * @author Sean A. Irvine
 */
public class A001274 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long phi = Functions.PHI.l(++mN);
      if (phi == Functions.PHI.l(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
