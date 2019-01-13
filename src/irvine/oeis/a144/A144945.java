package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144945.
 * @author Sean A. Irvine
 */
public class A144945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144945() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 6, 28, 76});
  }
}
