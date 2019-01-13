package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025846.
 * @author Sean A. Irvine
 */
public class A025846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025846() {
    super(new long[] {1, 0, 0, -1, 0, 0, 0, -1, 0, -1, 1, 0, 1, 0, 0, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 0, 1, 1, 0, 2, 1, 0, 2, 1, 1, 2, 2, 1, 3});
  }
}
