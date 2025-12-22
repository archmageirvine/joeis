package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082754 Triangle read by rows: T(n, k) = abs(n^k-k^n), 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A082754 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN).pow(mM).subtract(Z.valueOf(mM).pow(mN)).abs();
  }
}
