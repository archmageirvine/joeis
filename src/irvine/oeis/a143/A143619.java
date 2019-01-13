package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143619.
 * @author Sean A. Irvine
 */
public class A143619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143619() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 0, 1, 1, 1, 2, 1, 3, 2, 4});
  }
}
