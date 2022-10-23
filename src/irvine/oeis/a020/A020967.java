package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020967 a(n) = Sum_{k &gt;=1} floor(n*sqrt(2)^(3-k)).
 * @author Sean A. Irvine
 */
public class A020967 extends Sequence1 {

  private static final CR N = CR.SQRT2;
  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    Z sum = Z.NEG_ONE;
    Z t;
    long k = 3;
    do {
      t = ComputableReals.SINGLETON.pow(N, CR.valueOf(--k)).multiply(n).floor();
      sum = sum.add(t);
    } while (!t.isZero());
    return sum;
  }
}
