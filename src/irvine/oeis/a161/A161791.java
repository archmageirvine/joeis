package irvine.oeis.a161;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161791 Numbers k such that if k <code>= a*b</code>, then <code>a+b = reversal(k)</code> for some integers a,b <code>&gt; 1</code>.
 * @author Sean A. Irvine
 */
public class A161791 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final long r = LongUtils.reverse(++mN);
      for (final Z dd : Cheetah.factor(mN).divisors()) {
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
