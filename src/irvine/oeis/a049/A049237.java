package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049237 Quotient n/phi(n) for n in A007694.
 * @author Sean A. Irvine
 */
public class A049237 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long phi = LongUtils.phi(++mN);
      if (mN % phi == 0) {
        return Z.valueOf(mN / phi);
      }
    }
  }
}
