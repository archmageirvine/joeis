package irvine.oeis.a228;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228685 Number of 4 X n binary arrays with no two ones adjacent horizontally, diagonally or antidiagonally.
 * @author Georg Fischer
 */
public class A228685 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A228685() {
    super(1, "[0,16,9,-25,-18]", "[1,-2,-16,7,18]");
  }
}
