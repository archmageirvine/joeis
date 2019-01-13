package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076314.
 * @author Sean A. Irvine
 */
public class A076314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076314() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1});
  }
}
