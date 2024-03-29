package irvine.oeis.a368;
// Generated by gen_seq4.pl 2024-03-22/lingf at 2024-03-24 22:44

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A368956 a(n) = 3^n - 2^(n+1) - 1.
 * @author Georg Fischer
 */
public class A368956 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A368956() {
    super(1, "[0, -2, 12, -12]", "[1, -6, 11, -6]");
  }
}
