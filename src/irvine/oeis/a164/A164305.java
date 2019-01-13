package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164305.
 * @author Sean A. Irvine
 */
public class A164305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164305() {
    super(new long[] {-7, 6}, new long[] {3, 17});
  }
}
