package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064201 9 times octagonal numbers: a(n) = 9n(3n-2).
 * @author Sean A. Irvine
 */
public class A064201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064201() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 72});
  }
}
