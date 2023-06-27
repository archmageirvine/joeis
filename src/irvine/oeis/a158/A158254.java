package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158254 a(n) = 289n^2 + 2n.
 * @author Sean A. Irvine
 */
public class A158254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158254() {
    super(1, new long[] {1, -3, 3}, new long[] {291, 1160, 2607});
  }
}
