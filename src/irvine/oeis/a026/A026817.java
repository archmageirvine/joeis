package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026817 Duplicate of A022269.
 * @author Sean A. Irvine
 */
public class A026817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026817() {
    super(1, new long[] {1, -3, 3}, new long[] {6, 23, 51});
  }
}
