package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090040 (3*6^n + 2^n)/4.
 * @author Sean A. Irvine
 */
public class A090040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090040() {
    super(new long[] {-12, 8}, new long[] {1, 5});
  }
}
