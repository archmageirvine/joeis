package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
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
      if (Jaguar.factor(2 * ++mN + 2).sigma().longValueExact() == 4 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
