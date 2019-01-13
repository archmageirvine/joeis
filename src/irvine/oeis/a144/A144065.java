package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144065.
 * @author Sean A. Irvine
 */
public class A144065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144065() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 4, 6, 11});
  }
}
