package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191567.
 * @author Sean A. Irvine
 */
public class A191567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191567() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, 6, 4, 30, 3, 70, 24, 126, 10, 198, 60, 286});
  }
}
