package irvine.oeis.a368;
// Generated by gen_seq4.pl robots/lingf at 2024-01-19 09:53

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A368529 a(n) = Sum_{k=1..n} k^2 * 4^(n-k).
 * @author Georg Fischer
 */
public class A368529 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A368529() {
    super(0, "[0,1,1]", "[1,-7,15,-13,4]");
  }
}
