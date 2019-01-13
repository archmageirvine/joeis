package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143447.
 * @author Sean A. Irvine
 */
public class A143447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143447() {
    super(new long[] {2, 0, 0, 0, 1}, new long[] {1, 3, 5, 7, 9});
  }
}
