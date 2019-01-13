package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212975.
 * @author Sean A. Irvine
 */
public class A212975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212975() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 2, 15, 28, 65, 102});
  }
}
