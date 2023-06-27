package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192790 Molecular topological index of the Andrasfai graphs.
 * @author Sean A. Irvine
 */
public class A192790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192790() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {4, 80, 336, 880});
  }
}
