package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168244.
 * @author Sean A. Irvine
 */
public class A168244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168244() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, -1});
  }
}
