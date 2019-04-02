package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194642 Units' digits of the nonzero heptagonal numbers.
 * @author Sean A. Irvine
 */
public class A194642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194642() {
    super(new long[] {1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0}, new long[] {1, 7, 8, 4, 5, 1, 2, 8, 9, 5, 6, 2, 3, 9, 0});
  }
}
