package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025827.
 * @author Sean A. Irvine
 */
public class A025827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025827() {
    super(new long[] {1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 3, 2, 4});
  }
}
