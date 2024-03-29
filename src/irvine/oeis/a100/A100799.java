package irvine.oeis.a100;
// Generated by gen_seq4.pl padding 1 at 2020-08-22 18:36

import irvine.oeis.recur.PaddingSequence;

/**
 * A100799 a(1) = 1, a(2) = 2, a(n) = product of nonzero digits of previous two terms.
 * @author Georg Fischer
 */
public class A100799 extends PaddingSequence {

  /** Construct the sequence. */
  public A100799() {
    super(1, new long[]{1, 2, 2, 4, 8, 32}, new long[]{35280, 40320, 5760, 5040, 4200, 160, 48, 192, 576, 3780});
  }
}
