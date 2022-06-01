package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120846 a(n) = 3^n + 2^n + n.
 * @author Sean A. Irvine
 */
public class A120846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120846() {
    super(new long[] {-6, 17, -17, 7}, new long[] {2, 6, 15, 38});
  }
}
