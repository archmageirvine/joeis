package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037485.
 * @author Sean A. Irvine
 */
public class A037485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037485() {
    super(new long[] {-8, 1, 8}, new long[] {1, 10, 81});
  }
}
