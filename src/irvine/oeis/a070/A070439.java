package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070439.
 * @author Sean A. Irvine
 */
public class A070439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070439() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 9, 0, 9, 4, 1});
  }
}
