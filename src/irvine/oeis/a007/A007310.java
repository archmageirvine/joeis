package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A007310 Numbers congruent to 1 or 5 mod 6.
 * @author Sean A. Irvine
 */
public class A007310 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(3L * ++mN - 1 - (mN & 1));
  }

  @Override
  public Z a(final Z n) {
    return n.multiply(3).subtract(1).subtract(n.and(Z.ONE));
  }

  @Override
  public Z a(final long n) {
    return Z.valueOf(3L * n - 1 - (n & 1));
  }

}
