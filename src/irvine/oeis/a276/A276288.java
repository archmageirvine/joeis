package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276288.
 * @author Sean A. Irvine
 */
public class A276288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276288() {
    super(new long[] {-3, 0, 7, 0}, new long[] {0, 1, 1, 4});
  }
}
