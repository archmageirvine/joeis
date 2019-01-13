package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102296.
 * @author Sean A. Irvine
 */
public class A102296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102296() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 13, 43, 102});
  }
}
