package irvine.oeis.a069;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A069881 Numbers n such that n and 2n+1 are both palindromes.
 * @author Sean A. Irvine
 */
public class A069881 extends FilterSequence {

  /** Construct the sequence. */
  public A069881() {
    super(1, new A002113().skip(), k -> Predicates.PALINDROME.is(k.multiply2().add(1)));
  }
}

