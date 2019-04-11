package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291391 p-INVERT of <code>(1,1,0,0,0,0,...),</code> where p(S) <code>= (1 - 6</code> S)^2.
 * @author Sean A. Irvine
 */
public class A291391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291391() {
    super(new long[] {-36, -72, -24, 12}, new long[] {12, 120, 1080, 9180});
  }
}
