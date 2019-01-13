package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002537.
 * @author Sean A. Irvine
 */
public class A002537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002537() {
    super(new long[] {-9, 0, 8, 0}, new long[] {1, 1, 4, 11});
  }
}
