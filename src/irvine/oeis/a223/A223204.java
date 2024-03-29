package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A223204 Rolling icosahedron face footprints: number of n X 3 0..19 arrays starting with 0 where 0..19 label faces of an icosahedron and every array movement to a horizontal or vertical neighbor moves across an icosahedral edge.
 * @author Georg Fischer
 */
public class A223204 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A223204() {
    super(1, new long[] {0, 9, -6},
      new long[] {1, -9, 2});
  }
}
