package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254527 Total number of points on a sphere when both poles are on an x by x grid where x=8*n+1.
 * @author Sean A. Irvine
 */
public class A254527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254527() {
    super(new long[] {1, -3, 3}, new long[] {6, 26, 62});
  }
}
