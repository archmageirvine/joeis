package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086904 Write the primes in binary; a(n) = total number of 0's in those which have an n-bit expansion.
 * @author Sean A. Irvine
 */
public class A086904 extends Sequence2 {

  private long mN = 1;
  private long mP = 2;

  @Override
  public Z next() {
    final long lim = 1L << ++mN;
    long cnt = 0;
    while (mP < lim) {
      cnt += mN - Long.bitCount(mP);
      mP = Functions.NEXT_PRIME.l(mP);
    }
    return Z.valueOf(cnt);
  }
}
