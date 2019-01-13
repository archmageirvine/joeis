package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060633.
 * @author Sean A. Irvine
 */
public class A060633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060633() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {16, 123, 361, 778, 1428});
  }
}
