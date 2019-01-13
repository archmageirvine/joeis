package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024854.
 * @author Sean A. Irvine
 */
public class A024854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024854() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {4, 5, 16, 19, 40, 46, 80});
  }
}
