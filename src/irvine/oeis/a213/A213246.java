package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213246.
 * @author Sean A. Irvine
 */
public class A213246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213246() {
    super(new long[] {-64, 0, 0, 0, 0, 0, 65, 0, 0, 0, 0, 0}, new long[] {1, 1, 7, 5, 31, 7, 127, 85, 511, 341, 2047, 455});
  }
}
