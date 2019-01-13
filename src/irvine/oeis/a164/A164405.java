package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164405.
 * @author Sean A. Irvine
 */
public class A164405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164405() {
    super(new long[] {1, 0, 0, -1, 0, 2}, new long[] {1, 2, 4, 8, 14, 24});
  }
}
