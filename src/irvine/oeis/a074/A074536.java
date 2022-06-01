package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074536 a(n) = 2^n + 4^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074536() {
    super(new long[] {72, -62, 15}, new long[] {3, 15, 101});
  }
}
