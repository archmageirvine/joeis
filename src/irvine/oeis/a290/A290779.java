package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290779.
 * @author Sean A. Irvine
 */
public class A290779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290779() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 1, 57, 486, 2360, 8394, 24354});
  }
}
