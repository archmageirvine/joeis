package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254963.
 * @author Sean A. Irvine
 */
public class A254963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254963() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 25});
  }
}
