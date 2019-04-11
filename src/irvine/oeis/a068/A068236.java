package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068236 First differences of <code>(n+1)^5-n^5</code>.
 * @author Sean A. Irvine
 */
public class A068236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068236() {
    super(new long[] {-1, 4, -6, 4}, new long[] {30, 180, 570, 1320});
  }
}
