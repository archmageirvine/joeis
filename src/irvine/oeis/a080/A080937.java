package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080937 Number of Catalan paths <code>(nonnegative</code>, starting and ending at 0, step <code>+/-1)</code> of <code>2*n</code> steps with all values <code>&lt;= 5</code>.
 * @author Sean A. Irvine
 */
public class A080937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080937() {
    super(new long[] {1, -6, 5}, new long[] {1, 1, 2});
  }
}
