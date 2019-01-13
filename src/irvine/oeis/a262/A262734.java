package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262734.
 * @author Sean A. Irvine
 */
public class A262734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262734() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
  }
}
