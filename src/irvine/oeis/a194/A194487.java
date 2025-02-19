package irvine.oeis.a194;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A194487 Number of ways to arrange 3 nonattacking knights on the lower triangle of an n X n board.
 * @author Georg Fischer
 */
public class A194487 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A194487() {
    super(1, "[0,0,1,5,-1,36,-50,50,-40,22,-12,4]", "[1,-7,21,-35,35,-21,7,-1]");
  }
}
