package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229702.
 * @author Sean A. Irvine
 */
public class A229702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229702() {
    super(new long[] {6, -25, 40, -30, 10}, new long[] {1, 10, 70, 440, 2675});
  }
}
