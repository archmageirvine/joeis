package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001901 Successive numerators of Wallis's approximation to Pi/2 (reduced).
 * @author Sean A. Irvine
 */
public class A001901 extends Sequence0 {

  private long mN = 0;
  private Q mP = Q.ONE;
  private long mAdd = 1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mAdd = -mAdd;
      final long n = mN & ~1;
      mP = mP.multiply(new Q(n, n + mAdd));
    }
    return mP.num();
  }
}
