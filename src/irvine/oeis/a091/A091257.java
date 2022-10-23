package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A091257 Multiplication table A x B computed for polynomials over GF(2), where (A,B) runs as (1,1),(1,2),(2,1),(1,3),(2,2),(3,1),...
 * Adapted from A048720.
 * @author Georg Fischer
 */
public class A091257 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  private long multiply(final long a, final long b) {
    long sum = 0;
    for (long s = b, t = a; s != 0; s >>>= 1, t <<= 1) {
      if ((s & 1) == 1) {
        sum ^= t;
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(multiply(mN - mM + 1, mM));
  }
}
