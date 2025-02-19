package irvine.oeis.a250;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250421 Number of length 4+1 0..n arrays with the sum of the minimum of each adjacent pair multiplied by some arrangement of +-1 equal to zero.
 * @author Georg Fischer
 */
public class A250421 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A250421() {
    super(1, "[0,20,45,96,77,36,-48,-44,-37,0,-1]", "[1,-4,6,-6,9,-12,9,-6,6,-4,1]");
  }
}
