package irvine.oeis.a212;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A212342 Sequence of coefficients of x^0 in marked mesh pattern generating function Q_{n,132}^(0,3,0,0)(x).
 * @author Georg Fischer
 */
public class A212342 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A212342() {
    super(0, "[1,-2,2,1,-1]", "[1,-3,3,-1]");
  }
}
