package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143373.
 * @author Sean A. Irvine
 */
public class A143373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143373() {
    super(new long[] {1, 0, 2, 0, 2, 0, 1}, new long[] {1, 1, 1, 3, 5, 9, 17});
  }
}
