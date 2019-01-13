package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052899.
 * @author Sean A. Irvine
 */
public class A052899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052899() {
    super(new long[] {-4, 2, 3}, new long[] {1, 1, 5});
  }
}
