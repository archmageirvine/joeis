package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290764 Number of (non-null) connected induced subgraphs in the 2 X n king graph.
 * @author Sean A. Irvine
 */
public class A290764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290764() {
    super(new long[] {3, -7, 5}, new long[] {3, 15, 54});
  }
}
