package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213604.
 * @author Sean A. Irvine
 */
public class A213604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213604() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 7, 14, 18, 24, 28, 35, 41, 42});
  }
}
