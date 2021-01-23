package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120727 a(n) = a(n-1) + a(n-2), starting with 110, 211.
 * @author Sean A. Irvine
 */
public class A120727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120727() {
    super(new long[] {1, 1}, new long[] {110, 211});
  }
}
