package irvine.oeis.a269;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269932 Number of n X 2 0..6 arrays with some element plus some horizontally, diagonally, antidiagonally or vertically adjacent neighbor totalling six exactly once.
 * @author Georg Fischer
 */
public class A269932 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A269932() {
    super(1, "[0,7,690,8199,19736,-42600,20160,2800]", "[1,-30,-159,5480,41064,53760,19600]");
  }
}
