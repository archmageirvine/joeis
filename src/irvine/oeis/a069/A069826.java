package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069826 Numbers k such that sigma(k^2-k-1) = k*(k+1).
 * @author Sean A. Irvine
 */
public class A069826 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Functions.SIGMA.z(n.square().subtract(mN + 1)).equals(n.multiply(mN + 1))) {
        return n;
      }
    }
  }
}

