package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037633.
 * @author Sean A. Irvine
 */
public class A037633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037633() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 11, 58, 292});
  }
}
