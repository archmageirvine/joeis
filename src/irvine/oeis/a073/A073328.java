package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002034;

/**
 * A073328 Numbers n such that S(n) is a palindromic prime, where S(n) is the Kempner function A002034.
 * @author Sean A. Irvine
 */
public class A073328 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073328() {
    super(1, new A002034(), k -> Predicates.PALINDROME.is(k) && k.isProbablePrime());
  }
}

