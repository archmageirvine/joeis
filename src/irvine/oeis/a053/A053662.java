package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053662 Numbers n such that 2n+1 divides n!+1.
 * @author Sean A. Irvine
 */
public class A053662 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final long m = 2 * ++mN + 1;
      long f = 1;
      for (long k = 2; k <= mN; ++k) {
        f *= k;
        f %= m;
      }
      if (f == m - 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
