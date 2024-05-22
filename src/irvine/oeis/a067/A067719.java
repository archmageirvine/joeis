package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067719 Numbers k such that sigma(k^2 + 1) == 0 (mod k).
 * @author Sean A. Irvine
 */
public class A067719 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Functions.SIGMA1.z(n.square().add(1)).mod(mN) == 0) {
        return n;
      }
    }
  }
}
