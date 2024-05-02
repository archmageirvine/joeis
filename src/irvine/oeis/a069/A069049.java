package irvine.oeis.a069;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069049 Numbers k such that 2^k mod k = 2^phi(k) mod phi(k).
 * @author Sean A. Irvine
 */
public class A069049 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long phi = Functions.PHI.l(++mN);
      if (LongUtils.modPow(2, mN, mN) == LongUtils.modPow(2, phi, phi)) {
        return Z.valueOf(mN);
      }
    }
  }
}

