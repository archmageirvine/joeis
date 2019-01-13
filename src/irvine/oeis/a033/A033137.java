package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033137.
 * @author Sean A. Irvine
 */
public class A033137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033137() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 11, 110, 1101});
  }
}
