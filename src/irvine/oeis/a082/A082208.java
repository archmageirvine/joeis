package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A082208 Palindromes for which the sum of the digits is also a palindrome.
 * @author Sean A. Irvine
 */
public class A082208 extends FilterSequence {

  /** Construct the sequence. */
  public A082208() {
    super(1, new A002113(), k -> Predicates.PALINDROME.is(Functions.DIGIT_SUM.l(k)));
  }
}
