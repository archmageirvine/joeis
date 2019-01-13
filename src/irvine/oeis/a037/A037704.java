package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037704.
 * @author Sean A. Irvine
 */
public class A037704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037704() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {1, 9, 54, 326, 1957});
  }
}
