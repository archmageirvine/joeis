package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120727 <code>a(n) = a(n-1) + a(n-2),</code> starting with <code>110, 211</code>.
 * @author Sean A. Irvine
 */
public class A120727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120727() {
    super(new long[] {1, 1}, new long[] {110, 211});
  }
}
