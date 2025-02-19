package irvine.oeis.a194;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A194475 Number of ways to arrange 3 indistinguishable points on an n X n X n triangular grid so that no three points are in the same row or diagonal.
 * @author Georg Fischer
 */
public class A194475 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A194475() {
    super(1, "[0,0,1,10,7,-3]", "[1,-7,21,-35,35,-21,7,-1]");
  }
}
