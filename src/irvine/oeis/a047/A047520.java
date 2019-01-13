package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047520.
 * @author Sean A. Irvine
 */
public class A047520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047520() {
    super(new long[] {-2, 7, -9, 5}, new long[] {0, 1, 6, 21});
  }
}
