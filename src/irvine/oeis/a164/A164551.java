package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164551.
 * @author Sean A. Irvine
 */
public class A164551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164551() {
    super(new long[] {-19, 10}, new long[] {1, 9});
  }
}
