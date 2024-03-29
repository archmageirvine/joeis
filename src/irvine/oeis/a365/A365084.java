package irvine.oeis.a365;
// Generated by gen_seq4.pl robots/lingf at 2023-08-23 09:55

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A365084 G.f. satisfies A(x) = 1 + x*A(x) / (1 + x)^5.
 * @author Georg Fischer
 */
public class A365084 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A365084() {
    super(0, "[1,5,10,10,5,1]", "[1,4,10,10,5,1]");
  }
}
