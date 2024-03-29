package irvine.oeis.a104;
// Generated by gen_seq4.pl 2024-03-13/filter at 2024-03-19 13:51

import irvine.oeis.FilterSequence;

/**
 * A104481 Bisection of A104477.
 * @author Georg Fischer
 */
public class A104481 extends FilterSequence {

  /** Construct the sequence. */
  public A104481() {
    super(1, new A104477(), (n, v) -> (n & 1) == 1);
  }
}
