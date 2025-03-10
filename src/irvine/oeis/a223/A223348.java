package irvine.oeis.a223;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A223348 3 X 3 X 3 triangular graph without horizontal edges coloring a rectangular array: number of n X 4 0..5 arrays where 0..5 label nodes of a graph with edges 0,1 0,2 1,3 1,4 2,4 2,5 and every array movement to a horizontal or vertical neighbor moves along an edge of this graph.
 * @author Georg Fischer
 */
public class A223348 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A223348() {
    super(1, "[0,60,-304,48,896,-128,-512]", "[1,-23,66,52,-208,-32,128]");
  }
}
