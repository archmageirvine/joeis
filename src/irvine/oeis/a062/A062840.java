package irvine.oeis.a062;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001093;

/**
 * A062840 Palindromes of the form k^3 + 1.
 * @author Sean A. Irvine
 */
public class A062840 extends FilterSequence {

  /** Construct the sequence. */
  public A062840() {
    super(1, new A001093(), k -> Predicates.PALINDROME.is(10, k));
  }
}
