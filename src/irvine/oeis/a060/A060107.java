package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060107.
 * @author Sean A. Irvine
 */
public class A060107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060107() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 2, 3, 5, 7, 8, 10, 12});
  }
}
