package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152947.
 * @author Sean A. Irvine
 */
public class A152947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152947() {
    super(new long[] {1, -3, 3}, new long[] {1, 1, 2});
  }
}
