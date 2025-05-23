package irvine.oeis.a218;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A218659 Hilltop maps: number of n X 4 binary arrays indicating the locations of corresponding elements not exceeded by any king-move neighbor in a random 0..1 n X 4 array.
 * @author Georg Fischer
 */
public class A218659 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A218659() {
    super(1, "[0,9,117,144,-108,-81,-81]", "[1,-12,-45,-180,27,0,81]");
  }
}
