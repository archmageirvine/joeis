package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289521 Number of vertices in a planar Apollonian graph at iteration <code>n</code>.
 * @author Sean A. Irvine
 */
public class A289521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289521() {
    super(new long[] {-3, 4}, new long[] {4, 7});
  }
}
