package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156677.
 * @author Sean A. Irvine
 */
public class A156677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156677() {
    super(new long[] {1, -3, 3}, new long[] {43, 6, 131});
  }
}
