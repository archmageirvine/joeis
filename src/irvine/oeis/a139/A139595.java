package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139595 <code>A139277(n)</code> followed by <code>A139273(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A139595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139595() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 5, 13, 26});
  }
}
