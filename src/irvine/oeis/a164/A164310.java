package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164310.
 * @author Sean A. Irvine
 */
public class A164310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164310() {
    super(new long[] {-6, 6}, new long[] {4, 15});
  }
}
