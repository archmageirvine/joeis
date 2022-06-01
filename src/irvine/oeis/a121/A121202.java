package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121202 a(n) = 12*n + 7^n - 5^n.
 * @author Sean A. Irvine
 */
public class A121202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121202() {
    super(new long[] {-35, 82, -60, 14}, new long[] {0, 14, 48, 254});
  }
}
