package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053663 Numbers k such that 2*k+1 does not divide k!+1.
 * @author Sean A. Irvine
 */
public class A053663 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long m = 2 * ++mN + 1;
      long f = 1;
      for (long k = 2; k <= mN; ++k) {
        f *= k;
        f %= m;
      }
      if (f != m - 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
