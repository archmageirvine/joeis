package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120948 <code>8n+3^n+5^n</code>.
 * @author Sean A. Irvine
 */
public class A120948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120948() {
    super(new long[] {-15, 38, -32, 10}, new long[] {2, 16, 50, 176});
  }
}
