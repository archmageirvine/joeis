package irvine.oeis.a161;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A161791 Numbers k such that if k = a*b, then a+b = reversal(k) for some integers a,b &gt; 1.
 * @author Sean A. Irvine
 */
public class A161791 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final long r = Functions.REVERSE.l(++mN);
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final long d = dd.longValue();
        if (2 * d > mN) {
          break;
        }
        if (d > 1 && d + mN / d == r) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
