package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070403.
 * @author Sean A. Irvine
 */
public class A070403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070403() {
    super(new long[] {1, 0, 0}, new long[] {1, 7, 4});
  }
}
