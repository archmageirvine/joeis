package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074889 Non-palindromic numbers such that the two largest proper divisors are palindromes having at least two digits and no other divisor is a palindrome with at least two digits.
 * @author Sean A. Irvine
 */
public class A074889 extends Sequence1 {

  private long mN = 523;

  private boolean is(final long n) {
    if (Predicates.PALINDROME.is(n)) {
      return false;
    }
    final long d = n / Functions.LPF.l(n);
    if (d < 10 || !Predicates.PALINDROME.is(d)) {
      return false;
    }
    final Z[] divs = Jaguar.factor(n).divisorsSorted();
    if (divs.length < 3) {
      return false;
    }
    assert Predicates.PALINDROME.is(divs[divs.length - 2]);
    final long d2 = divs[divs.length - 3].longValue();
    if (d2 < 10 || !Predicates.PALINDROME.is(d2)) {
      return false;
    }
    for (int k = divs.length - 4; k >= 0; --k) {
      final long dd = divs[k].longValue();
      if (dd > 9 && Predicates.PALINDROME.is(dd)) {
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
