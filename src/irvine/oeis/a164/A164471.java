package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164471.
 * @author Sean A. Irvine
 */
public class A164471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164471() {
    super(new long[] {-2, 2, -1, 2}, new long[] {13, 21, 35, 59});
  }
}
