package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051794.
 * @author Sean A. Irvine
 */
public class A051794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051794() {
    super(new long[] {1, 0, 1, 0, 1, 0, -1, 0, -1, 0, -1, 0}, new long[] {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1});
  }
}
