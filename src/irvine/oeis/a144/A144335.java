package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144335.
 * @author Sean A. Irvine
 */
public class A144335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144335() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 11, 32, 76});
  }
}
