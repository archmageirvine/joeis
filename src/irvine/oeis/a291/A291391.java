package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291391 p-INVERT of (1,1,0,0,0,0,...), where p(S) = (1 - 6 S)^2.
 * @author Sean A. Irvine
 */
public class A291391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291391() {
    super(new long[] {-36, -72, -24, 12}, new long[] {12, 120, 1080, 9180});
  }
}
