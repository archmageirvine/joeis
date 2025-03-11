package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a067.A067019;

/**
 * A075815 Palindromic odd composite numbers with an odd number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A075815 extends FilterSequence {

  /** Construct the sequence. */
  public A075815() {
    super(1, new A067019(), k -> !k.isProbablePrime() && Predicates.PALINDROME.is(k));
  }
}
