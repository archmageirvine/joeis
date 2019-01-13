package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164505.
 * @author Sean A. Irvine
 */
public class A164505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164505() {
    super(new long[] {-1, 0, -2, 2, -1, 2}, new long[] {13, 20, 31, 48, 74, 114});
  }
}
