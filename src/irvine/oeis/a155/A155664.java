package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155664 a(n) = 10^n+8^n-1.
 * @author Sean A. Irvine
 */
public class A155664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155664() {
    super(new long[] {80, -98, 19}, new long[] {1, 17, 163});
  }
}
