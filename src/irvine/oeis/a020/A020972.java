package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020972.
 * @author Sean A. Irvine
 */
public class A020972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020972() {
    super(new long[] {756, -255, 28}, new long[] {1, 28, 529});
  }
}
