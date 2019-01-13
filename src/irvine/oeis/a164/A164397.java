package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164397.
 * @author Sean A. Irvine
 */
public class A164397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164397() {
    super(new long[] {1, 0, -2, 0, 0, 2}, new long[] {1, 2, 4, 8, 14, 24});
  }
}
