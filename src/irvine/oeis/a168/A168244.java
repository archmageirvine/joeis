package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168244 <code>a(n) = 1 + 3*n - 2*n^2</code>.
 * @author Sean A. Irvine
 */
public class A168244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168244() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, -1});
  }
}
