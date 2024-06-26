package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-27/lingf at 2024-05-28 02:23

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A372242 a(n) = 10*Fibonacci(n) + (-1)^n.
 * @author Georg Fischer
 */
public class A372242 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A372242() {
    super(0, "[1, 9, 9]", "[1, 0, -2, -1]");
  }
}
