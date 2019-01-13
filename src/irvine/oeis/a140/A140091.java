package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140091.
 * @author Sean A. Irvine
 */
public class A140091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140091() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 15});
  }
}
