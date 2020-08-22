package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120849 5n+3^n-2^n.
 * @author Sean A. Irvine
 */
public class A120849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120849() {
    super(new long[] {-6, 17, -17, 7}, new long[] {0, 6, 15, 34});
  }
}
