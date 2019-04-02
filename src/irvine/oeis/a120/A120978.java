package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120978 2n+5^n-3^n.
 * @author Sean A. Irvine
 */
public class A120978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120978() {
    super(new long[] {-15, 38, -32, 10}, new long[] {0, 4, 20, 104});
  }
}
