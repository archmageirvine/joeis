package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-27/lingf at 2024-05-28 02:23

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A372878 a(n) is the sum of all symmetric valleys in the set of flattened Catalan words of length n.
 * @author Georg Fischer
 */
public class A372878 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A372878() {
    super(4, "[0, 0, 0, 0, 1, -2]", "[1, -9, 30, -46, 33, -9]");
  }
}
