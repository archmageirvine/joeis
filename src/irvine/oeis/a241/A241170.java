package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241170 Steffensen's bracket function <code>[n,n-3]</code>.
 * @author Sean A. Irvine
 */
public class A241170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241170() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6, 25, 67, 145, 275});
  }
}
