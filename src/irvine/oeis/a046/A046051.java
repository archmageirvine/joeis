package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046051 Number of prime factors of Mersenne number M(n) = 2^n - 1 (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046051 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Functions.BIG_OMEGA.z(Z.ONE.shiftLeft(mN).subtract(1));
  }
}

