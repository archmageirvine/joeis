package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037527.
 * @author Sean A. Irvine
 */
public class A037527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037527() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 21, 210, 2102});
  }
}
