package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084640 Generalized Jacobsthal numbers.
 * @author Sean A. Irvine
 */
public class A084640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084640() {
    super(new long[] {-2, 1, 2}, new long[] {0, 1, 5});
  }
}
