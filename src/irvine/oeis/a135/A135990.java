package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135990.
 * @author Sean A. Irvine
 */
public class A135990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135990() {
    super(new long[] {1, -2, 0, 1, 0}, new long[] {0, 0, 1, 0, 0});
  }
}
