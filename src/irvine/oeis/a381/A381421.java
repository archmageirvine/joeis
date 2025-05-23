package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-31.ack/lingf at 2025-03-31 23:38

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A381421 a(n) = Sum_{k=0..n} (k+1) * binomial(2*k,2*n-2*k).
 * @author Georg Fischer
 */
public class A381421 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A381421() {
    super(0, "[1,-2,-1, 6, 1]", "[1,-4, 2, 0, 11, 0, 2,-4, 1]");
  }
}
