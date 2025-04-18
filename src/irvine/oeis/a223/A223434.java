package irvine.oeis.a223;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A223434 Generalized Petersen graph (8,2) coloring a rectangular array: number of n X 2 0..15 arrays where 0..15 label nodes of a graph with edges 0,1 0,8 8,14 8,10 1,2 1,9 9,15 9,11 2,3 2,10 10,12 3,4 3,11 11,13 4,5 4,12 12,14 5,6 5,13 13,15 6,7 6,14 7,0 7,15 and every array movement to a horizontal or vertical neighbor moves along an edge of this graph.
 * @author Georg Fischer
 */
public class A223434 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A223434() {
    super(1, "[0,48,-128,-144]", "[1,-8,11,16]");
  }
}
