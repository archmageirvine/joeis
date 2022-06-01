package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020739 2n + 6.
 * @author Sean A. Irvine
 */
public class A020739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020739() {
    super(new long[] {-1, 2}, new long[] {6, 8});
  }
}
