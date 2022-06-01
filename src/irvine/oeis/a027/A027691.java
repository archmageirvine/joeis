package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027691 a(n) = n^2 + n + 6.
 * @author Sean A. Irvine
 */
public class A027691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027691() {
    super(new long[] {1, -3, 3}, new long[] {6, 8, 12});
  }
}
