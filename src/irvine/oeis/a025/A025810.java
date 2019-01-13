package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025810.
 * @author Sean A. Irvine
 */
public class A025810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025810() {
    super(new long[] {1, 0, -1, 0, 0, -1, 0, 1, 0, 0, -1, 0, 1, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 3, 3, 3});
  }
}
