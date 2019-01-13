package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037520.
 * @author Sean A. Irvine
 */
public class A037520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037520() {
    super(new long[] {-3, 1, 0, 3}, new long[] {2, 7, 21, 65});
  }
}
