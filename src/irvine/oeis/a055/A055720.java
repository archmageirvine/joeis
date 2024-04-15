package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055720 Numbers k such that d(k)+1 | k.
 * @author Sean A. Irvine
 */
public class A055720 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (n.mod(Functions.SIGMA0.z(n).add(1)).isZero()) {
        return n;
      }
    }
  }
}
