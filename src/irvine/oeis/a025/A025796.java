package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025796.
 * @author Sean A. Irvine
 */
public class A025796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025796() {
    super(new long[] {1, 0, -1, -1, 0, 1, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 3, 1, 3, 3, 3});
  }
}
