package irvine.oeis.a229;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A229535 Number of defective 3-colorings of a 2 X n 0..2 array connected horizontally, diagonally and antidiagonally with exactly one mistake, and colors introduced in row-major 0..2 order.
 * @author Georg Fischer
 */
public class A229535 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A229535() {
    super(1, "[0,0,4,-8,4]", "[1,-4,0,8,4]");
  }
}
