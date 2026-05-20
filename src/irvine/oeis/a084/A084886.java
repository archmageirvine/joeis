package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084886 Triangular array, read by rows: T(n,k) = numerator of arithmetic derivative of k/n, 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A084886 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return new Q(Functions.ARD.z(mM).multiply(mN).subtract(Functions.ARD.z(mN).multiply(mM)), mN * mN).num();
  }
}
