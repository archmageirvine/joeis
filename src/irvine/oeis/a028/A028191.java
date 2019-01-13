package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028191.
 * @author Sean A. Irvine
 */
public class A028191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028191() {
    super(new long[] {-3960, 2087, -399, 33}, new long[] {1, 33, 690, 11690});
  }
}
