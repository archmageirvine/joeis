package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A394546 Base 10 palindromes greater than 1 such that division by their highest prime factor does not result in a palindrome.
 * @author Sean A. Irvine
 */
public class A394546 extends FilterSequence {

  /** Construct the sequence. */
  public A394546() {
    super(1, new A002113().skip(2), k -> !Predicates.PALINDROME.is(k.divide(Functions.GPF.z(k))));
  }
}
