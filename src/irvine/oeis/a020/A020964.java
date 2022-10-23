package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020964 Sum of Floor[ 3*(1+sqrt(2))^(n-k) ] for k from 1 to infinity.
 * @author Sean A. Irvine
 */
public class A020964 extends Sequence1 {

  private static final CR N = CR.SQRT2.add(CR.ONE);
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z t;
    long k = 0;
    do {
      t = ComputableReals.SINGLETON.pow(N, CR.valueOf(mN - ++k)).multiply(CR.THREE).floor();
      sum = sum.add(t);
    } while (!t.isZero());
    return sum;
  }
}
