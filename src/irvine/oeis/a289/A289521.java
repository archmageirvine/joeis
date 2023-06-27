package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289521 Number of vertices in a planar Apollonian graph at iteration n.
 * @author Sean A. Irvine
 */
public class A289521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289521() {
    super(1, new long[] {-3, 4}, new long[] {4, 7});
  }
}
