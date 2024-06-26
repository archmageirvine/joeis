package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-27/lingf at 2024-05-28 02:23

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A372225 a(n) = Fibonacci(n+1)*Fibonacci(2n).
 * @author Georg Fischer
 */
public class A372225 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A372225() {
    super(1, "[0, 1, 3]", "[1, -3, -6, 3, 1]");
  }
}
