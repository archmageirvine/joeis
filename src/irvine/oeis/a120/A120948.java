package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120948 8n+3^n+5^n.
 * @author Sean A. Irvine
 */
public class A120948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120948() {
    super(new long[] {-15, 38, -32, 10}, new long[] {2, 16, 50, 176});
  }
}
