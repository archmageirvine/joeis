package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092182.
 * @author Sean A. Irvine
 */
public class A092182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092182() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 120, 947, 3652, 9985});
  }
}
