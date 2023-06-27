package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083564 a(n) = L(n)*L(2n), where L(n) are the Lucas numbers (A000204).
 * @author Sean A. Irvine
 */
public class A083564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083564() {
    super(1, new long[] {-1, -3, 6, 3}, new long[] {3, 21, 72, 329});
  }
}
