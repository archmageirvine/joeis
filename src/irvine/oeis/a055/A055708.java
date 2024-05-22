package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055708 Numbers n such that n - 1 | sigma(n).
 * @author Sean A. Irvine
 */
public class A055708 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).mod(mN - 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
