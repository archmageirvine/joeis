package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291912 Number of 6-cycles in the n X n rook complement graph.
 * @author Sean A. Irvine
 */
public class A291912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291912() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 0, 60, 18336, 840800, 14629200, 143939460, 971877760, 5018582016L, 21193207200L, 76518984300L, 243664127520L, 699965254560L});
  }
}
