package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143484.
 * @author Sean A. Irvine
 */
public class A143484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143484() {
    super(new long[] {1, -2, 2, -1, 0, 0, 1, -2, 2, -1, 0, 0, 1, -2, 2, -1, 0, 0, 1, -2, 2}, new long[] {1, 1, 1, 4, 4, 1, 1, 1, 3, 3, 3, 4, 4, 3, 3, 3, 2, 2, 2, 4, 4});
  }
}
