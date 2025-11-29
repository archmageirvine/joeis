package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A082207 Palindromes whose product of digits is a positive palindrome.
 * @author Sean A. Irvine
 */
public class A082207 extends FilterSequence {

  /** Construct the sequence. */
  public A082207() {
    super(1, new A002113(), k -> {
      final Z prod = Functions.DIGIT_PRODUCT.z(k);
      return !prod.isZero() && Predicates.PALINDROME.is(prod);
    });
  }
}
