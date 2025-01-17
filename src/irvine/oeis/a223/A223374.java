package irvine.oeis.a223;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A223374 3 X 3 square grid graph coloring a rectangular array: number of n X 3 0..8 arrays where 0..8 label nodes of the square grid graph and every array movement to a horizontal or vertical neighbor moves along an edge of this graph.
 * @author Georg Fischer
 */
public class A223374 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A223374() {
    super(1, "[0,68,912,-1796,-8800,5160,12672,-576]", "[1,0,-221,0,1718,0,-1872]");
  }
}
