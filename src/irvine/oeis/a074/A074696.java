package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074696 Numbers k such that 2^k+1 has more than k divisors (k such that A000005(2^k+1) &gt; k).
 * @author Sean A. Irvine
 */
public class A074696 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.z(Z.ONE.shiftLeft(++mN).add(1)).compareTo(mN) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
