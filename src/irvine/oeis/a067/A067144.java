package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067144 Numbers k such that sigma(phi(k)) == 0 (mod k).
 * @author Sean A. Irvine
 */
public class A067144 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(Functions.PHI.z(++mN)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
