package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164438.
 * @author Sean A. Irvine
 */
public class A164438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164438() {
    super(new long[] {-1, 0, 0, 1, 1}, new long[] {13, 21, 32, 49, 73});
  }
}
