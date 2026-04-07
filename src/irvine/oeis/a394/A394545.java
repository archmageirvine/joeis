package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A394545 Base 10 palindromes greater than 1 such that division by their highest prime factor also results in a palindrome.
 * @author Sean A. Irvine
 */
public class A394545 extends FilterSequence {

  /** Construct the sequence. */
  public A394545() {
    super(1, new A002113().skip(2), k -> Predicates.PALINDROME.is(k.divide(Functions.GPF.z(k))));
  }
}
