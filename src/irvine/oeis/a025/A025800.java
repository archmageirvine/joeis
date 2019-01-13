package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025800.
 * @author Sean A. Irvine
 */
public class A025800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025800() {
    super(new long[] {1, 0, -1, -1, 0, 1, 0, 0, 0, 0, 0, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 2, 1, 2, 2, 2, 3, 3, 3, 4, 4});
  }
}
