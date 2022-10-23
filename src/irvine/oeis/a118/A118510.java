package irvine.oeis.a118;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A118510 Define sequence S_m by: initial term = m, reverse digits and add 1 to get next term. It is conjectured that S_m always reaches a cycle of length 9, as in A117230. Sequence gives records for number of steps to reach cycle.
 * a(n) = 1 + 9*(n-1) for odd n; a(n) = 9*n for even n.
 * @author Georg Fischer
 */
public class A118510 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(((mN & 1) == 1) ? 9L * (mN - 1) + 1 : 9L * mN);
  }
}
