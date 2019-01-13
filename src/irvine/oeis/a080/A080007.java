package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080007.
 * @author Sean A. Irvine
 */
public class A080007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080007() {
    super(new long[] {-1, 0, -1, -2, 0, 4, 2, 2, 1, 0}, new long[] {1, 0, 0, 1, 2, 4, 4, 8, 19, 32});
  }
}
