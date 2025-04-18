package irvine.oeis.a228;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228664 Number of 5 X n binary arrays with top left value 1 and no two ones adjacent horizontally, diagonally or antidiagonally.
 * @author Georg Fischer
 */
public class A228664 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A228664() {
    super(1, "[0,16,-35,-86,162,29,-66]", "[1,-4,-34,76,134,-258,-45,102]");
  }
}
