package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020958 a(n) = Sum_{k &gt;= 1} floor(3*tau^(n-k)).
 * @author Sean A. Irvine
 */
public class A020958 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.FIVE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= 3 * mN; ++k) {
      sum = sum.add(ComputableReals.SINGLETON.pow(CR.PHI, CR.valueOf(mN - k)).multiply(CR.THREE).floor());
    }
    return sum;
  }
}
