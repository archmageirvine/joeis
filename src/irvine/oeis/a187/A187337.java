package irvine.oeis.a187;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A187337 a(n) = Sum_{k=1..6} floor(k*n/7).
 * @author Georg Fischer
 */
public class A187337 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A187337() {
    super(0, "[0,0,3,3,3,3,3,6]", "[1,-1,0,0,0,0,0,-1,1]");
  }
}
