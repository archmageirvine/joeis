package irvine.oeis.a244;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A244974 Sum of numbers m &lt;= n whose set of prime divisors is a subset of the set of prime divisors of n.
 * @author Sean A. Irvine
 */
public class A244974 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z nk = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      nk = nk.multiply(mN);
      sum = sum.add(nk.divide(k).subtract(nk.subtract(1).divide(k)).multiply(k));
    }
    return sum;
  }
}
