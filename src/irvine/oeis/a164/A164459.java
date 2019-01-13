package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164459.
 * @author Sean A. Irvine
 */
public class A164459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164459() {
    super(new long[] {1, -1, 1, -2, 0, 0, 2}, new long[] {13, 21, 35, 58, 96, 159, 264});
  }
}
