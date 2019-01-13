package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061866.
 * @author Sean A. Irvine
 */
public class A061866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061866() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 0, 0, 1, 2, 4});
  }
}
