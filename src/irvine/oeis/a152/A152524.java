package irvine.oeis.a152;
// manually linmangf/lingf at 2023-02-23 23:42

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A152524 a(n) is the number of L-bit words in which, if up to k bits are perturbed, the resulting change in unsigned L-bit value is n, for L=8 and k=7.
 * <code>a(n) = 511 + (-1)^n - 2*n</code>
 * @author Georg Fischer
 */
public class A152524 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return (((mN & 1) == 0) ? Z.ONE : Z.NEG_ONE).add(511).subtract(2L * mN);
  }
}
