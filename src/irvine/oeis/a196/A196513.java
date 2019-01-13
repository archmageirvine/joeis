package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196513.
 * @author Sean A. Irvine
 */
public class A196513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196513() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 28, 308, 1218, 3298});
  }
}
