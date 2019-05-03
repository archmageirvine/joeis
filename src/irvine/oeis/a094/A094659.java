package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094659 Number of closed walks of length n at a vertex of the cyclic graph on 7 nodes <code>C_7</code>.
 * @author Sean A. Irvine
 */
public class A094659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094659() {
    super(new long[] {-2, -3, 4, 1}, new long[] {1, 0, 2, 0});
  }
}
