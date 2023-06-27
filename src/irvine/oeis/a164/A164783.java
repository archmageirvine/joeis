package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164783 7^n-6.
 * @author Sean A. Irvine
 */
public class A164783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164783() {
    super(1, new long[] {-7, 8}, new long[] {1, 43});
  }
}
