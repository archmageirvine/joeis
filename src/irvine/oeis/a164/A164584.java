package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164584.
 * @author Sean A. Irvine
 */
public class A164584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164584() {
    super(new long[] {-16, 0, 24, 0}, new long[] {1, 6, 12, 136});
  }
}
