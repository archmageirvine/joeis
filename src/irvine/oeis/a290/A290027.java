package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290027 Number of 4-cycles in the n-halved cube graph.
 * @author Sean A. Irvine
 */
public class A290027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290027() {
    super(new long[] {32, -80, 80, -40, 10}, new long[] {0, 0, 3, 102, 900});
  }
}
