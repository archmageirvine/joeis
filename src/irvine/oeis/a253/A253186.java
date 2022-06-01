package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253186 Number of connected unlabeled loopless multigraphs with 3 vertices and n edges.
 * @author Sean A. Irvine
 */
public class A253186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253186() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {0, 0, 1, 2, 3, 4});
  }
}
