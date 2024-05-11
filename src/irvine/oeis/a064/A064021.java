package irvine.oeis.a064;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a035.A035090;

/**
 * A064021 Squares k^2 such that reverse(k)^2 = reverse(k^2), excluding squares of palindromes.
 * @author Sean A. Irvine
 */
public class A064021 extends FilterSequence {

  /** Construct the sequence. */
  public A064021() {
    super(new A035090(), k -> !Predicates.PALINDROME.is(10, k.sqrt()));
  }
}
