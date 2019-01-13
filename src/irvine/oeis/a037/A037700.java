package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037700.
 * @author Sean A. Irvine
 */
public class A037700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037700() {
    super(new long[] {-9, 1, 0, 0, 9}, new long[] {1, 11, 102, 918, 8263});
  }
}
