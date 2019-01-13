package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247060.
 * @author Sean A. Irvine
 */
public class A247060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247060() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 5, 8, 12, 16, 17});
  }
}
