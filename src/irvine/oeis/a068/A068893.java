package irvine.oeis.a068;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a085.A085869;

/**
 * A068893 Nonpalindromic numbers that have the same prime signature as their digit reversal.
 * @author Sean A. Irvine
 */
public class A068893 extends FilterSequence {

  /** Construct the sequence. */
  public A068893() {
    super(1, new A085869(), k -> !Predicates.PALINDROME.is(10, k));
  }
}
