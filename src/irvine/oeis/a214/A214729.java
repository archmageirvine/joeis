package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214729.
 * @author Sean A. Irvine
 */
public class A214729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214729() {
    super(new long[] {1, -3, 0, 3}, new long[] {0, 13, 34, 102});
  }
}
