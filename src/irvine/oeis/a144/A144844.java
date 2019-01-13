package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144844.
 * @author Sean A. Irvine
 */
public class A144844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144844() {
    super(new long[] {8, -28, 14}, new long[] {0, 1, 16});
  }
}
