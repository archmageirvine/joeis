package irvine.oeis.a053;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053577 Cototient function n - phi(n) is a power of 2.
 * @author Sean A. Irvine
 */
public class A053577 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long t = ++mN - Euler.phiAsLong(mN);
      if ((t & (t - 1)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
