package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001694;

/**
 * A060860 Numbers k such that k^2-1 and k^2 are consecutive powerful numbers.
 * @author Sean A. Irvine
 */
public class A060860 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (A001694.isPowerful(n.square().subtract(1))) {
        return n;
      }
    }
  }
}
