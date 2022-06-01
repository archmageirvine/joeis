package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134465 Row sums of triangle A134464.
 * @author Sean A. Irvine
 */
public class A134465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134465() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 6, 16, 32});
  }
}
