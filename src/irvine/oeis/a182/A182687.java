package irvine.oeis.a182;
// Generated by gen_seq4.pl padding 1 at 2020-08-22 18:36

import irvine.oeis.recur.PaddingSequence;

/**
 * A182687 a(n) = the smallest 1-digit number with exactly n divisors, a(n) = 0 if no such number exists.
 * @author Georg Fischer
 */
public class A182687 extends PaddingSequence {

  /** Construct the sequence. */
  public A182687() {
    super(1, new long[]{1, 2, 4, 6}, new long[]{0});
  }
}
