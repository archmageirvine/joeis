package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020720 Pisot sequences E(7,9), P(7,9).
 * @author Sean A. Irvine
 */
public class A020720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020720() {
    super(new long[] {1, 1, 0}, new long[] {7, 9, 12});
  }
}
