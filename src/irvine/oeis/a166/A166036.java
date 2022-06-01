package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166036 a(n) = (4^n+8*(-5)^n)/9.
 * @author Sean A. Irvine
 */
public class A166036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166036() {
    super(new long[] {20, -1}, new long[] {1, -4});
  }
}
