package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070430.
 * @author Sean A. Irvine
 */
public class A070430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070430() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {0, 1, 4, 4, 1});
  }
}
