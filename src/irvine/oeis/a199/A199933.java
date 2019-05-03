package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199933 Trisection 0 of <code>A199744</code>.
 * @author Sean A. Irvine
 */
public class A199933 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199933() {
    super(new long[] {-1, 1, -5, -1}, new long[] {1, 1, -4, 0});
  }
}
