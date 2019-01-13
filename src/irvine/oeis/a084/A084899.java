package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084899.
 * @author Sean A. Irvine
 */
public class A084899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084899() {
    super(new long[] {8, -12, 6}, new long[] {0, 1, 9});
  }
}
