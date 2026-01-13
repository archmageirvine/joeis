package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.LengthPalindromes;
import irvine.math.z.PrefixedPalindromes;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083142 Palindromes that cannot be expressed as the difference of two palindromes.
 * @author Sean A. Irvine
 */
public class A083142 extends Sequence1 {

  private final PrefixedPalindromes mP9 = new PrefixedPalindromes("9");

  private boolean is(final Z p) {
    final int len = Functions.DIGIT_LENGTH.i(p);
    final LengthPalindromes lp = new LengthPalindromes(len + 1);
    Z t;
    while ((t = lp.next()) != null) {
      if (Predicates.PALINDROME.is(t.subtract(p))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = mP9.next();
      if (!is(p)) {
        return p;
      }
    }
  }
}

