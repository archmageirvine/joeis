package irvine.oeis.a296;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A296984 Number of n X 2 0..1 arrays with each 1 adjacent to 3, 4 or 5 king-move neighboring 1s.
 * @author Georg Fischer
 */
public class A296984 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A296984() {
    super(1, "[0,1,0,-1,-6,-6,-4]", "[1,-2,-1,-3,4,2,4]");
  }
}
