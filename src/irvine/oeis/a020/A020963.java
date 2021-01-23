package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020963 Sum of Floor[ 2*(1+sqrt(2))^(n-k) ] for k from 1 to infinity.
 * @author Sean A. Irvine
 */
public class A020963 implements Sequence {

  private static final CR N = CR.SQRT2.add(CR.ONE);
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= 2 * mN; ++k) {
      sum = sum.add(ComputableReals.SINGLETON.pow(N, CR.valueOf(mN - k)).multiply(CR.TWO).floor());
    }
    return sum;
  }
}
