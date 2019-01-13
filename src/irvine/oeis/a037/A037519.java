package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037519.
 * @author Sean A. Irvine
 */
public class A037519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037519() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 20, 201, 2012});
  }
}
