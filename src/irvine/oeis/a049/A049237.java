package irvine.oeis.a049;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049237 Quotient n/phi(n) for n in A007694.
 * @author Sean A. Irvine
 */
public class A049237 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long n = ++mN;
      final long phi = Euler.phiAsLong(n);
      if (mN % phi == 0) {
        return Z.valueOf(mN / phi);
      }
    }
  }
}
