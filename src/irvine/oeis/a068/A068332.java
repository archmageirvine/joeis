package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068332 Numbers n such that 2^tau(n)&lt;=n&lt;2*2^tau(n).
 * @author Sean A. Irvine
 */
public class A068332 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s0 = Functions.SIGMA0.z(++mN);
      if (s0.bitLength() < 6) {
        final long t = 1L << s0.longValueExact();
        if (t <= mN && 2 * t > mN) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
