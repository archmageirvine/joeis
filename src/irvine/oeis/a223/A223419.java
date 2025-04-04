package irvine.oeis.a223;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A223419 3-level binary fanout graph coloring a rectangular array: number of n X 4 0..6 arrays where 0..6 label nodes of a graph with edges 0,1 1,3 1,4 0,2 2,5 2,6 and every array movement to a horizontal or vertical neighbor moves along an edge of this graph.
 * @author Georg Fischer
 */
public class A223419 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A223419() {
    super(1, "[0,48,-208,-48,416,64,-128]", "[1,-14,36,40,-88,-32,32]");
  }
}
