package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213243.
 * @author Sean A. Irvine
 */
public class A213243 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213243() {
    super(new long[] {-4, 0, 5, 0}, new long[] {1, 1, 7, 5});
  }
}
