package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265430.
 * @author Sean A. Irvine
 */
public class A265430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265430() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 3, 3, 5});
  }
}
