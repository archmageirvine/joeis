package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138055.
 * @author Sean A. Irvine
 */
public class A138055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138055() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1}, new long[] {1, 3, 5, 9, 3, 1, 9});
  }
}
