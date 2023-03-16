package irvine.oeis.a053;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053159 Numbers n such that n+cototient(n) is a power of 2.
 * @author Sean A. Irvine
 */
public class A053159 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long t = 2 * ++mN - Euler.phiAsLong(mN);
      if ((t & (t - 1)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
