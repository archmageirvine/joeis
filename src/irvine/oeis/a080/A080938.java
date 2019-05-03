package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080938 Number of Catalan paths <code>(nonnegative</code>, starting and ending at 0, step <code>+/-1)</code> of <code>2*n</code> steps with all values less than or equal to 7.
 * @author Sean A. Irvine
 */
public class A080938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080938() {
    super(new long[] {-1, 10, -15, 7}, new long[] {1, 1, 2, 5});
  }
}
