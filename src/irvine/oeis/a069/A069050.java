package irvine.oeis.a069;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069050 Numbers k such that 2^k mod phi(k) = 2^phi(k) mod k.
 * @author Sean A. Irvine
 */
public class A069050 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      final long phi = Functions.PHI.l(n);
      if (LongUtils.modPow(2, mN, phi) == LongUtils.modPow(2, phi, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

