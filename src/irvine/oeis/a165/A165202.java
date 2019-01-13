package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165202.
 * @author Sean A. Irvine
 */
public class A165202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165202() {
    super(new long[] {-1, 2, -3, 2}, new long[] {1, 3, 3, -1});
  }
}
