package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074851.
 * @author Sean A. Irvine
 */
public class A075407 extends Sequence1 {

  private long mN = 301;

  private boolean is(final long n) {
    if (Predicates.PALINDROME.is(n)) {
      return false;
    }
    final long d = n / Functions.LPF.l(n);
    if (d < 10 || !Predicates.PALINDROME.is(d)) {
      return false;
    }
    for (final Z div : Jaguar.factor(n).divisors()) {
      final long dd = div.longValue();
      if (dd > 9 && dd != d && Predicates.PALINDROME.is(dd)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
