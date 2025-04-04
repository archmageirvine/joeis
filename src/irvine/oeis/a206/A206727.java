package irvine.oeis.a206;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A206727 Number of nX1 0..2 arrays avoiding the pattern z-1 z-1 z in any row, column or nw-to-se diagonal.
 * @author Georg Fischer
 */
public class A206727 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A206727() {
    super(1, "[0,3,0,-2,0,1]", "[1,-3,0,2,0,-1]");
  }
}
