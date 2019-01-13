package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037628.
 * @author Sean A. Irvine
 */
public class A037628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037628() {
    super(new long[] {-7, 1, 0, 7}, new long[] {2, 17, 119, 835});
  }
}
