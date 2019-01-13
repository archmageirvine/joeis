package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025807.
 * @author Sean A. Irvine
 */
public class A025807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025807() {
    super(new long[] {1, 0, -1, 0, 0, -1, 0, 0, 0, 1, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 1, 1, 2, 1, 2, 2, 2, 3, 2});
  }
}
