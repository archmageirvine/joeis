package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a038.A038548;

/**
 * A034836 Number of ways to write n as n = x*y*z with 1 &lt;= x &lt;= y &lt;= z.
 * @author Sean A. Irvine
 */
public class A034836 implements Sequence {

  private final MemorySequence mA038548 = MemorySequence.cachedSequence(new A038548());
  private int mN = 0;

  /*
  (PARI) A038548(n)=sumdiv(n, d, d*d<=n)
     a(n)=sumdiv(n, d, if(d^3<=n, A038548(n/d) - sumdiv(n/d, d0, d0<d)))
   */

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final Z n = Z.valueOf(++mN);
    for (final Z dd : Cheetah.factor(n).divisorsSorted()) {
      final int d = dd.intValue();
      if (dd.pow(3).compareTo(n) > 0) {
        break;
      }
      sum = sum.add(mA038548.a(mN / d - 1));
      for (final Z dd0 : Cheetah.factor(mN / d).divisorsSorted()) {
        final int d0 = dd0.intValue();
        if (d0 >= d) {
          break;
        }
        sum = sum.subtract(1);
      }
    }
    return sum;
  }
}
