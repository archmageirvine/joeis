package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067519 Numbers k such that k^2 + 1 is composite and phi(k^2 + 1) == 0 (mod k).
 * @author Sean A. Irvine
 */
public class A067519 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().add(1);
      if (!t.isProbablePrime() && Functions.PHI.z(t).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

