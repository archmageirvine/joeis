package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000040;

/**
 * A084122 Numbers k such that k*prime(k) is a palindrome.
 * @author Sean A. Irvine
 */
public class A084122 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084122() {
    super(1, 1, new A000040(), (n, p) -> Predicates.PALINDROME.is(p.multiply(n)));
  }
}

