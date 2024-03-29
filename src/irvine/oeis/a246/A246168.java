package irvine.oeis.a246;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A246168 a(n) = 2^n - 10.
 * @author Sean A. Irvine
 */
public class A246168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246168() {
    super(new long[] {-2, 3}, new long[] {-9, -8});
  }
}
