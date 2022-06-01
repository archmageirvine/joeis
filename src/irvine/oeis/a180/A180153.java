package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180153 a(n) = 10*a(n-1) + A109242(n).
 * @author Sean A. Irvine
 */
public class A180153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180153() {
    super(new long[] {-10000, 12100, -2220, 121}, new long[] {1, 121, 12421, 1246421});
  }
}
