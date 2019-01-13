package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164420.
 * @author Sean A. Irvine
 */
public class A164420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164420() {
    super(new long[] {-1, 0, 0, 0, 1, 1}, new long[] {1, 2, 4, 8, 13, 21});
  }
}
