package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-03-26/filnum at 2024-03-26 23:22

import irvine.oeis.FilterNumberSequence;

/**
 * A370921 Positive integers in whose ternary representation, 2 occurs at least once, and every 2 is followed by 1.
 * @author Georg Fischer
 */
public class A370921 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A370921() {
    super(1, 1, k -> {
      final String s = Integer.toString(k, 3).replaceAll("21", "xx");
      return s.indexOf('2') < 0 && s.indexOf('x') >= 0;
    });
  }
}
