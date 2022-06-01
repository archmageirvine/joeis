package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153388 Second bisection of A153382.
 * @author Sean A. Irvine
 */
public class A153388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153388() {
    super(new long[] {1, -4, 4}, new long[] {8, 18, 48});
  }
}
