package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164453.
 * @author Sean A. Irvine
 */
public class A164453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164453() {
    super(new long[] {1, -1, 1, -1, 2}, new long[] {13, 21, 35, 58, 97});
  }
}
