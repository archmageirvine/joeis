package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120950 3^n+5^n-2n.
 * @author Sean A. Irvine
 */
public class A120950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120950() {
    super(new long[] {-15, 38, -32, 10}, new long[] {2, 6, 30, 146});
  }
}
