package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293005.
 * @author Sean A. Irvine
 */
public class A293005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293005() {
    super(new long[] {-2, 0, 3}, new long[] {0, 1, 4});
  }
}
