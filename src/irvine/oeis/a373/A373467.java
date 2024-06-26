package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-13/filter at 2024-06-14 00:04

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A373467 Palindromes with exactly 7 (distinct) prime divisors.
 * @author Georg Fischer
 */
public class A373467 extends FilterSequence {

  /** Construct the sequence. */
  public A373467() {
    super(1, new A002113(), v -> Functions.OMEGA.i(v) == 7);
  }
}
