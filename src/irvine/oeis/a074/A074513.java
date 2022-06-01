package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074513 a(n) = 1^n + 4^n + 7^n.
 * @author Sean A. Irvine
 */
public class A074513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074513() {
    super(new long[] {28, -39, 12}, new long[] {3, 12, 66});
  }
}
