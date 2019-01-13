package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186950.
 * @author Sean A. Irvine
 */
public class A186950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186950() {
    super(new long[] {1, -3, 3}, new long[] {479, 433, 389});
  }
}
