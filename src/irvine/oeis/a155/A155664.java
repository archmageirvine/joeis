package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155664 <code>10^n+8^n-1</code>.
 * @author Sean A. Irvine
 */
public class A155664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155664() {
    super(new long[] {80, -98, 19}, new long[] {1, 17, 163});
  }
}
