package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180355 a(n) = n^5 + 5n.
 * @author Sean A. Irvine
 */
public class A180355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180355() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 6, 42, 258, 1044, 3150});
  }
}
