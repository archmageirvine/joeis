package irvine.oeis.a084;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046034;

/**
 * A084983 Palindromes made of only prime digits.
 * @author Georg Fischer
 */
public class A084983 extends FilterSequence {

  /** Construct the sequence. */
  public A084983() {
    super(1, new A046034(), v -> Predicates.PALINDROME.is(v));
  }
}
