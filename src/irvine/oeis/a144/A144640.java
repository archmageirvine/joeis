package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144640.
 * @author Sean A. Irvine
 */
public class A144640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144640() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 17, 48, 102});
  }
}
