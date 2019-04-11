package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239592 <code>(n^4 - n^3 + 4*n^2 + 2)/2</code>.
 * @author Sean A. Irvine
 */
public class A239592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239592() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 13, 46, 129});
  }
}
