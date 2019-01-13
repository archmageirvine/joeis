package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025873.
 * @author Sean A. Irvine
 */
public class A025873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025873() {
    super(new long[] {1, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, -1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 1, 2, 0, 0, 1, 3, 0, 0, 2, 3, 0, 1});
  }
}
