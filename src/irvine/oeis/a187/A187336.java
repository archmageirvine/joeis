package irvine.oeis.a187;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A187336 Sum{floor(kn/6), k=1,2,3,4,5}.
 * @author Georg Fischer
 */
public class A187336 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A187336() {
    super(0, "[0,0,3,3,2,2,5]", "[1,-1,0,0,0,0,-1,1]");
  }
}
