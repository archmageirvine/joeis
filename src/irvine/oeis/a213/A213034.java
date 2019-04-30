package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213034 <code>[3n/2]*[n/3]</code>, where <code>[] =</code> floor.
 * @author Sean A. Irvine
 */
public class A213034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213034() {
    super(new long[] {1, -1, 0, -1, 1, 0, -1, 1, 0, 1}, new long[] {0, 0, 0, 4, 6, 7, 18, 21, 24, 40});
  }
}
