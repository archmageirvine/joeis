package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037607.
 * @author Sean A. Irvine
 */
public class A037607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037607() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 9, 66, 463});
  }
}
