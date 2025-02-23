package irvine.oeis.a160;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A160846 Number of lines through at least 2 points of a 6 X n grid of points.
 * @author Georg Fischer
 */
public class A160846 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A160846() {
    super(0, "[0,1,38,75,135,168,192,156,117,63,32,7,6,6]", "[1,0,0,-1,-1,-1,0,1,1,1,0,0,-1]");
  }
}
