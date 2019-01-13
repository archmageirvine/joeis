package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276063.
 * @author Sean A. Irvine
 */
public class A276063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276063() {
    super(new long[] {-1, 0, 0, -3, 1, 0, -3, 2, 1, -1, 1, 1}, new long[] {0, 0, 0, 0, 0, 2, 2, 4, 4, 8, 14, 20});
  }
}
