package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067680 Numbers k such that sigma(2k + 2) = 4k.
 * @author Sean A. Irvine
 */
public class A067680 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.l(2 * ++mN + 2) == 4 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
