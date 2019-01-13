package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164852.
 * @author Sean A. Irvine
 */
public class A164852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164852() {
    super(new long[] {-10, -10, 11, 1}, new long[] {1, 12, 13, 124});
  }
}
