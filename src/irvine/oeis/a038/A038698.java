package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038698 Surfeit of 4k-1 primes over 4k+1 primes, beginning with prime 2.
 * @author Sean A. Irvine
 */
public class A038698 extends A000040 {

  private long mBias = 0;

  @Override
  public Z next() {
    mBias += super.next().and(Z.THREE).intValueExact() - 2;
    return Z.valueOf(mBias);
  }
}
