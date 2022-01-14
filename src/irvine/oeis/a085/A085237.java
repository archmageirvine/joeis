package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A085237 Nondecreasing gaps between primes.
 * @author Sean A. Irvine
 */
public class A085237 extends A001223 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z gap = super.next();
      if (gap.compareTo(mPrev) >= 0) {
        mPrev = gap;
        return gap;
      }
    }
  }
}
