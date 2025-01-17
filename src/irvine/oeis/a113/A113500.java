package irvine.oeis.a113;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A113500 Maximum element in the continued fraction for F(5n+3)^5/F(5n+2)^5 where F=A000045 are Fibonacci numbers.
 * @author Georg Fischer
 */
public class A113500 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A113500() {
    super(0, "[32,-894,965,140,-1]", "[1,-123,0,123,-1]");
  }
}
